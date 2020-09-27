package com.bupt.controller;

import com.bupt.domain.User;
import com.sun.tracing.dtrace.ModuleAttributes;
import com.sun.xml.internal.ws.api.server.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import sun.security.pkcs11.Secmod;

import java.util.Date;
import java.util.Map;

/**
 * 常用注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) // 把msg = 美美存入到session域对象中
public class AnnoController {
    /**
     * 测试RequestParam注解@RequestParam(name="name")
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name="name") String username){
        System.out.println("RequestParam注解执行了。。。。。");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取请求体的内容
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("RequestParam注解执行了。。。。。");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("RequestParam注解执行了。。。。。");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头的值
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("RequestParam注解执行了。。。。。");
        System.out.println(header);
        return "success";
    }

    /**
     * 获取Cookie的值
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String tesCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("RequestParam注解执行了。。。。。");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModuleAttribute注解

     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("RequestParam注解执行了。。。。。");
        System.out.println(user);
        return "success";
    }

    /**
     * 该方法会先执行
     */
    /*@ModelAttribute
    public User showUser(String uname){
        System.out.println("showUser执行了......");
        // 通过用户名查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(24);
        user.setDate(new Date());
        return user;

    }*/

    @ModelAttribute
    public void showUser(String uname, Map<String, User> map){
        System.out.println("showUser执行了......");
        // 通过用户名查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(24);
        user.setDate(new Date());
        map.put("abc",user);
    }

    /**
     * SessionAttributes注解
     * @return
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes......");
        // 底层会存储到request域对象中
        model.addAttribute("msg","美美");
        return "success";
    }

    /**
     * 从Session域中获取值
     * @return
     */
    @RequestMapping(value = "/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("getSessionAttributes......");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 从Session域中删除值
     * @param status
     * @return
     */
    @RequestMapping(value = "/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        System.out.println("delSessionAttributes......");
        status.setComplete();
        return "success";
    }
}
