package com.szxy.springboot_quickly_szxy.dao;

import com.szxy.springboot_quickly_szxy.pojo.Stu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    public Stu selectStu(String id);
    public int insertStu(Stu stu);
    public int updateStu(Stu stu);
    public int deleteStu(String id);

}
