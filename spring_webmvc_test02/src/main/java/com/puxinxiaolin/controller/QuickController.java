package com.puxinxiaolin.controller;

import com.puxinxiaolin.service.QuickService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class QuickController {

    @Resource
    private QuickService quickService;

    @RequestMapping("/show")
    public String show() {
        System.out.println("QuickController.show running...." + quickService);
        return "/index.jsp";
    }

}
