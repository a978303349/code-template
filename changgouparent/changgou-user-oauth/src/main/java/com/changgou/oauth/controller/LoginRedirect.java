package com.changgou.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/oauth")
public class LoginRedirect {

    /**
     * 跳转登录页面
     * @return
     */
    @GetMapping("/login")
    public String login(@RequestParam(value = "FROM",required = false,defaultValue = "")String from, Model model){
        //存储
        model.addAttribute("from",from);
        return "login";
    }
}
