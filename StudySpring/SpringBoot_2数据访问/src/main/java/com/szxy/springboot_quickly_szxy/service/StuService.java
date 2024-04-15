package com.szxy.springboot_quickly_szxy.service;

import com.szxy.springboot_quickly_szxy.pojo.Stu;

public interface StuService {
    public Stu selectStu(String id);
    public int insertStu(Stu stu);
    public int updateStu(String id);
    public int deleteStu(String id);


}
