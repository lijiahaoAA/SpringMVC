package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;

/*
* 常用的注解
* */
@Controller
@RequestMapping(path = "/anno")
public class AnnoController {

    @RequestMapping(path = "/testRequestParam")
    /*超链接使用的参数是name，方法参数名称是username，使用注解RequestParam可以使用属性name=超链接参数
    * @RequestParam 把请求中指定名称的参数给控制器中的形参赋值*/
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("执行了。。。");
        System.out.println("username="+username);
        return "success";
    }
}
