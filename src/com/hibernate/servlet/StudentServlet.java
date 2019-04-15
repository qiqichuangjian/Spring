package com.hibernate.servlet;

import com.hibernate.entity.Student;
import com.hibernate.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Acthor:孙琪; date:2019/4/12;
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getParameter("action");
        System.out.println(action);
        if("queryPage".equals(action)){
            queryPage(request, response);
        }else if("add".equals(action)){
            add(request, response);
        }else if("update".equals(action)){
            update(request, response);
        }else if("delete".equals(action)){
            delete(request, response);
        }else if("queryOne".equals(action)){
            queryOne(request, response);
        }
    }
    protected void queryPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        // 不用new Service了，直接从StudentDaoImpl.class里拿  studentDaoImpl对应@Repository("studentDaoImpl")
       // StudentDaoImpl service = ac.getBean("studentDaoImpl", StudentDaoImpl.class);
        //都行，但用studentDaoImpl的话，绕过了service,不太合理
        StudentService service = ac.getBean("studentService", StudentService.class);
        //页码
        int pageIndex =1; // 初始页码
        // 获取参数
        String index = request.getParameter("pageIndex");
        if(index!=null){
            pageIndex=Integer.parseInt(index);
        }
        // 每页条数
        int pageCount = 5;
        int pages = service.pages(pageCount);
        List<Student> sList = service.queryPage(pageIndex, pageCount);
        request.setAttribute("pages",pages);
        request.setAttribute("sList",sList);
        request.getRequestDispatcher("/query.jsp").forward(request,response);
    }
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        StudentService service = ac.getBean("studentService", StudentService.class);
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        int num = service.add(new Student(name, sex, Integer.parseInt(age)));
        if(num>0){
            System.out.println("add success!");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }else{
            System.out.println("add fail!");
        }
    }
    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        StudentService service = ac.getBean("studentService", StudentService.class);
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        int num = service.update(new Student(Integer.parseInt(id), name, sex, Integer.parseInt(age)));
        if(num>0){
            System.out.println("update success!");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }else{
            System.out.println("update fail!");
        }
    }
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        StudentService service = ac.getBean("studentService", StudentService.class);
        String id = request.getParameter("id");
        Student s = service.queryOne(Integer.parseInt(id));
        if (s != null) {
            System.out.println("根据id查询成功");
            int num=service.delete(s);
            if(num>0){
                System.out.println("delete success!!");
                request.getRequestDispatcher("/index.jsp").forward(request,response);
            }else{
                System.out.println("delete success!!");

            }
        } else {
            System.out.println("根据id查询失败!");
        }
    }
    protected void queryOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        StudentService service = ac.getBean("studentService", StudentService.class);
        String id = request.getParameter("id");
        Student studentById = service.queryOne(Integer.parseInt(id));
        if(studentById!=null){
            System.out.println("根据id查询到对象");
            request.setAttribute("studentById", studentById);
            request.getRequestDispatcher("/update.jsp").forward(request, response);
        }else{
            System.out.println("没有根据id查询到对象");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
