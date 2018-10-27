//package com.yung.auto.web.thymeleaf.service;
//
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
///**
// * Created by yungwang on 2018/10/27.
// */
//@Controller
//@RequestMapping(value = "/static")
//public class ImageController {
//
//    @RequestMapping(value = "/get",produces = MediaType.IMAGE_JPEG_VALUE)
//    @ResponseBody
//    public BufferedImage getImage(@PathVariable String imageName) throws IOException {
//
//        return ImageIO.read(new FileInputStream(new File("/static/"+imageName)));
//    }
//
//}
