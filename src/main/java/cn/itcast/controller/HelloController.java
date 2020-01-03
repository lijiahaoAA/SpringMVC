package cn.itcast.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器的类
@Controller
@RequestMapping(path = "/user")//一级目录
public class HelloController {
    @RequestMapping(path = "/hello")//二级目录
    public String sayHello(){
        System.out.println("Hello,Springmvc!");
        return "success";
    }
    /*
    *RequestMapping注解
    *@return
    * 指定请求方法为post，即超链接默认的get请求无法使用此方法
    * */
    @RequestMapping(value = "/testRequestMapping",method = {RequestMethod.GET},params = "username=heihei",headers = "ACCEPT")
    /*
    * @RequestMapping(value = "/testRequestMapping")
    * @RequestMapping(name = "/testRequestMapping")
    * @RequestMapping("/testRequestMapping")
    * 三者作用是相同的！
    * */
    public String testRequestMapping(){
        System.out.println("测试requestMapping注解！");
        return  "success";
    }
}
