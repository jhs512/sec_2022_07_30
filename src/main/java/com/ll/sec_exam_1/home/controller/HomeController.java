package com.ll.sec_exam_1.home.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/home/main")
    @ResponseBody
    public String showMain(HttpSession session) {
        SecurityContext securityContext = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
        System.out.println(securityContext);

        return "main";
    }

    @RequestMapping("/home/private")
    @ResponseBody
    public String showPrivate(HttpSession session) {
        // 스프링 시큐리티는 내부적으로 세션을 사용
        SecurityContext securityContext = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
        System.out.println(securityContext);

        return "private";
    }
}
