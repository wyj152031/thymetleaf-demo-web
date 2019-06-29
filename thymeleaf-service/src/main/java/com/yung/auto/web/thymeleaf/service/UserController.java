package com.yung.auto.web.thymeleaf.service;

import com.yung.auto.web.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yungwang on 2018/10/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public String getUser(@PathVariable Integer id, Model model) {
        model.addAttribute("user",new User(id,"小仙女",18,"扬州"));
        return "user/detail";
    }

    @RequestMapping("/list")
    public String listUser(Model model) {
        List<User> users = new ArrayList<>();

        for(int i=0;i<10;i++) {
            users.add(new User(i,"wanglin"+i,18,"中国南京"+i));
        }
        model.addAttribute("users",users);
        return "/user/list";
    }

}

