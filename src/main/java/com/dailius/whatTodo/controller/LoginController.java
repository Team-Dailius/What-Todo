package com.dailius.whatTodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")       // TODO: 수정 필요
    public String login() {
        return "page/loginPage";
    }
}
