package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;


import javax.servlet.http.HttpServletRequest;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Map;

/*
* 常用的注解
* */
@Controller
@RequestMapping(path = "/anno")
//把msg=美美存放在session域对象中另一份
@SessionAttributes(value = {"msg"})
public class AnnoController {

    @RequestMapping(path = "/testRequestParam")
    /*超链接使用的参数是name，方法参数名称是username，使用注解RequestParam可以使用属性name=超链接参数
    * @RequestParam 把请求中指定名称的参数给控制器中的形参赋值*/
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("执行了。。。");
        System.out.println("username="+username);
        return "success";
    }

    @RequestMapping(path = "/testRequestBody")
    /*
     * @RequestBody 把请求中指定名称的参数全部赋值给body（body实际是一个key-value集合）*/
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了。。。");
        System.out.println(body);
        return "success";
    }

    @RequestMapping(path = "/testPathVariable/{sid}")
    /*
     * @PathVariable 用于绑定url的占位符*/
    public String testPathVariable(@PathVariable(value = "sid") String id){
        System.out.println("执行了。。。");
        System.out.println("sid="+id);
        return "success";
    }

    @RequestMapping(path = "/testRequestHeader")
    /*
     * @RequestHeader 用于获取请求头*/
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("执行了。。。");
        System.out.println("header="+header);
        return "success";
    }

    @RequestMapping(path = "/testCookieValue")
    /*
     * @RequestHeader 用于获取请求头
     * JSESSIONID为一个session值 jsessionid ==request.getSession().getId()*/
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("执行了。。。");
        System.out.println("cookieValue="+cookieValue);
        return "success";
    }

    @RequestMapping(path = "/testModelAttribute")
    /*
     * @ModelAttribute 作用在参数上，无返回值类型，获取指定的参数信息
     * 把abc给User对象*/
    public String tesModelAttribute(@ModelAttribute(value = "abc") User user){
        System.out.println("tesModelAttribute执行了。。。");
        System.out.println(user);
        return "success";
    }
    /*
    * 有返回值类型的，作用在方法上
    * 该方法会先于控制器方法tesModelAttribute前执行
    @ModelAttribute
    public User showUser(String uname ){
        System.out.println("showUser执行了。。。");
        //通过uname查询数据库(模拟)
        User user = new User();
        user.setUname(uname);
        user.setUage(20);
        user.setDate(new Date());
        return user;
    }*/

    /*
     * 无返回值类型的
     * 该方法会先于控制器方法tesModelAttribute前执行*/
    @ModelAttribute
    public void showUser(String uname,Map<String,User> map){
        System.out.println("showUser执行了。。。");
        //通过uname查询数据库(模拟)
        User user = new User();
        user.setUname(uname);
        user.setUage(20);
        user.setDate(new Date());
        map.put("abc",user);
    }

    @RequestMapping(path = "/testSessionAttributes")
    /*
     * @SessionAttributes 用于多次执行控制器方法间的参数共享
     * 把值存放在request域中，类上的注解SessionAttributes复制一份值*/
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes执行了。。。");
        //Model底层会将数据存储到request域对象中。即不必和原生servlet API耦合
        //把美美存到msg中
        model.addAttribute("msg","美美");
        return "success";
    }

    @RequestMapping(path = "/getSessionAttributes")
    /*
     * @SessionAttributes 用于多次执行控制器方法间的参数共享
     * 从session域中获取值*/
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttributes执行了。。。");
        //Model底层会将数据存储到request域对象中。即不必和原生servlet API耦合
        String msg = (String)modelMap.get( "msg");
        System.out.println(msg);
        return "success";
    }

    @RequestMapping(path = "/delSessionAttributes")
    /*
     * @SessionAttributes 用于多次执行控制器方法间的参数共享
     * 从session域中删除值*/
    public String delSessionAttributes(SessionStatus status){
        System.out.println("delSessionAttributes执行了。。。");
        status.setComplete();
        return "success";
    }
}
