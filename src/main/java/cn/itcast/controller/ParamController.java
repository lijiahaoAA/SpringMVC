package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.nio.file.Path;

/*
* 请求参数绑定
* */
@Controller
@RequestMapping(path = "/param")
public class ParamController {
    /**
    * 请求参数绑定入门
    * @return String
    * */
    @RequestMapping(path = "/testParam")
    public String testParam(String username,String password){
        System.out.println("执行了。。。。");
        System.out.println("用户名是："+username);
        System.out.println("密码是："+password);
        return "success";
    }
    /**
     * 请求参数绑定—把数据封装到javabean的类中
     * @return String
     * */
    @RequestMapping(path = "/saveAccount")
    //参数为domain中Account类的实例，等价于封装了传入的参数
    public String saveAccount(Account account){
        System.out.println("javabean执行了。。。。");
        System.out.println(account.toString());
        //System.out.println(account);与上方作用一致
        return "success";
    }

    /**
     * 自定义类型转换器
     */
    @RequestMapping(path = "/saveUser")
    //参数为domain中Account类的实例，等价于封装了传入的参数
    public String saveUser(User user){
        System.out.println("javabean执行了。。。。");
        System.out.println(user);
        //System.out.println(account);与上方作用一致
        return "success";
    }

    /**
     * 测试原生Servlet API接口
     */
    @RequestMapping(path = "/testServlet")
    //参数为domain中Account类的实例，等价于封装了传入的参数
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("javabean执行了。。。。");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }
}
