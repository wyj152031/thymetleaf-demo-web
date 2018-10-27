package com.yung.auto.web.thymeleaf.model;

/**
 * Created by yungwang on 2018/10/27.
 */
public class FileName {
    private int number;
    private String imageName;

    public FileName() {
    }

    public FileName(int number, String imageName) {
        this.number = number;
        this.imageName = imageName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
