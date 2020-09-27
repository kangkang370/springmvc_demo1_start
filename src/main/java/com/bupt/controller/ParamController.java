package com.bupt.controller;

import com.bupt.domain.Account;
import com.bupt.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * @return
     */
    @RequestMapping("/restParam")
    public String testParam(String username, String password) {
        System.out.println("请求参数绑定执行了。。。。。");
        System.out.println("用户名："+ username);
        System.out.println("密码："+ password);
        return "success";
    }

    /**
     * 请求参数绑定把数据封装到JavaBean的类中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String testParam(Account account) {
        System.out.println("请求参数绑定执行了。。。。。");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        System.out.println("执行了。。。。。");
        System.out.println(user);
        return "success";
    }

    /**
     * 测试原生API
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行了。。。。。");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(request);
        return "success";
    }
}
