package com.szxy.springboot_quickly_szxy.service.serviceImpl;

import com.szxy.springboot_quickly_szxy.dao.StuMapper;
import com.szxy.springboot_quickly_szxy.pojo.Stu;
import com.szxy.springboot_quickly_szxy.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper stuMapper;

    @Override
    public Stu selectStu(String id) {
        return stuMapper.selectStu(id);
    }

    @Override
    public int insertStu(Stu stu) {
        return stuMapper.insertStu(stu);
    }

    @Override
    public int updateStu(String id) {
        return stuMapper.updateStu(id);
    }

    @Override
    public int deleteStu(String id) {
        return stuMapper.deleteStu(id);
    }


}
