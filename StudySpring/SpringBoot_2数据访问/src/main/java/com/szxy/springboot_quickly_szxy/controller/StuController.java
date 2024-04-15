package com.szxy.springboot_quickly_szxy.controller;

import com.szxy.springboot_quickly_szxy.pojo.Stu;
import com.szxy.springboot_quickly_szxy.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {
    @Autowired
    private StuService stuService;
    @RequestMapping("/selectStu")
    public Stu selectStu(String id){
        return stuService.selectStu(id);
    }
    @RequestMapping("/insertStu")
    public int insertStu(Stu stu){
        return stuService.insertStu(stu);
    }
    @RequestMapping("/updateStu")
    public int updateStu(String id){
        return stuService.updateStu(id);
    }
    @RequestMapping("/deleteStu")
    public int deleteStu(String id){
        return stuService.deleteStu(id);
    }
}
