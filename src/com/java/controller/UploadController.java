package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/fileupload")
    public String upload(@RequestParam("file1") MultipartFile file, HttpServletRequest request) throws IOException {
        if(!file.getOriginalFilename().isEmpty()) {
            String root = request.getServletContext().getRealPath("/");
            File fileurl = new File(root, "/files/");
            System.out.println(file.getOriginalFilename());
//        String filePath = "c:/"+file.getOriginalFilename();
            fileurl.mkdirs();
            System.out.println(fileurl);//输出上传图片后图片的地址
            file.transferTo(new File(fileurl, file.getOriginalFilename()));
        }
        return "success";
    }
    @RequestMapping("/fileupload2")
    public String upload(@RequestParam("file") MultipartFile[] files) throws IOException {
        for (MultipartFile file:files) {
            System.out.println(file.getOriginalFilename());
           if(!file.getOriginalFilename().isEmpty()){
               String filePath = "F:\\file\\image\\"+file.getOriginalFilename();
               System.out.println(filePath);
               file.transferTo(new File(filePath));
           }
        }
        return "success";
    }
}
