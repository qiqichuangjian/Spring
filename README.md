1.SpringIOC 的注入方式
    1）.通过setter方法 (通过属性的set方法)
    2）.通过构造方法（类型，索引，联合）
    3）.工厂方法注入（静态工厂，非静态工厂）
2.参数注入：
    bean注入
    内部bean
    null注入
    级联注入
    集合注入
    Properties注入
    
  总结：  IOC 控制反转：将控制权转交给Spring容器Bean
             怎么实现IOC 
                解析xml用dom4j解析（一次性全部加载），文件 小 时用
                sax解析（边加载边解析），文件 大 时用
                dom4j解析xml+反射机制进行springIOC的手写
        DI  依赖注入 解决了程序的耦合性