package com.yung.auto.web.thymeleaf.service;

import com.yung.auto.web.thymeleaf.model.FileName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yungwang on 2018/10/27.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        List<FileName> list = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            String tempPng = i + ".png";
            String tempJpg = "00" + i + ".jpg";
            FileName fileName = new FileName(i, tempJpg);
            list.add(fileName);
        }
        model.addAttribute("list", list);
        return "index";
    }
}
