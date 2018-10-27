package com.yung.auto.web.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yungwang on 2018/10/27.
 */
@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {
        "com.yung.auto.web.thymeleaf.model",
        "com.yung.auto.web.thymeleaf.service"})
public class Application  extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

//        int port = context.getEnvironment().getProperty("server.port", int.class);
//        System.setProperty("java.awt.headless", "false");
//        Desktop.getDesktop().browse(new URI("http://127.0.0.1:8080/"));
    }

}
