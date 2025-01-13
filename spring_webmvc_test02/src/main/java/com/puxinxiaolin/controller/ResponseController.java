package com.puxinxiaolin.controller;

import com.puxinxiaolin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@ResponseBody
//@Controller
@RestController
public class ResponseController {

    @GetMapping("/ajax/req3")
    public User req3() {
        User user = new User();
        user.setUsername("lin");
        user.setAge(20);
        return user;
    }

    @GetMapping("/res1")
    public String res1() {
        return "redirect:/index.jsp";
    }

    @RequestMapping("/res2")
    public String res2() {
        return "forward:/index.jsp";
    }

    // 转发方式
    @RequestMapping("/res3")
    public ModelAndView res3(ModelAndView modelAndView) {
        // 封装模型数据和视图名
        User user = new User();
        user.setUsername("lin");
        user.setAge(20);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }

    @RequestMapping("/res4")
    @ResponseBody
    public String res4() {
        return "hello mvc";
    }

}
