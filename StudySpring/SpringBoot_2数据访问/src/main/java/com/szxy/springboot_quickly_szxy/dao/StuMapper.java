package com.szxy.springboot_quickly_szxy.dao;

import com.szxy.springboot_quickly_szxy.pojo.Stu;
import org.apache.ibatis.annotations.*;

/**
 * 整合springboot和mybatis来操作mysql数据库，来实现对数据库的
 * 增删改查
 * Mapper：表示该类是一个mybatis的接口文件
 * 此代码是为了实现对mysql数据表的增删改查操作
 * Select:根据id查询数据，返回值是一个实体类
 */
@Mapper
public interface StuMapper {

//    @Select("select * from stu where id=#{id}")
//    public Stu findById(String id);
//
//    @Insert("insert into stu(id,name,age,gender,clazz) values(#{id},#{name},#{age},#{gender},#{clazz})")
//    public int insertStu(Stu stu);
//
//    @Update("update stu set name=#{name} where id=#{id}")
//    public int updateStu(Stu stu);
//
//    @Delete("delete from stu where id=#{id}")
//    public int deleteStu(String id);
    public Stu selectStu(String id);
    public int insertStu(Stu stu);
    public int updateStu(String id);
    public int deleteStu(String id);

}
