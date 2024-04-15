package com.szxy.springboot_quickly_szxy;

//import com.szxy.springboot_quickly_szxy.controller.HelloController;
import com.szxy.springboot_quickly_szxy.dao.StuMapper;
//import com.szxy.springboot_quickly_szxy.pojo.Myproperties;
//import com.szxy.springboot_quickly_szxy.pojo.Person;
import com.szxy.springboot_quickly_szxy.dao.StudentMapper;
import com.szxy.springboot_quickly_szxy.pojo.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootQuicklySzxyApplicationTests {

    //    @Autowired
//    private HelloController helloController;
//    @Test
//    public void helloTest(){
//        String hello = helloController.hello();
//        System.out.println(hello);
//    }
//
//    @Autowired
//    private Person person;
//    @Test
//    public void personTest(){
//        System.out.println(person);
//    }
//
//    @Autowired
//    private Myproperties myproperties;
//    @Test
//    public void mypropertiesTest(){
//        System.out.println(myproperties);
//    }
//
//    @Autowired
//    private StuMapper userMapper;
//    @Test
//    public void SelectStu(){
//        Stu byId = userMapper.findById("2021110408");
//        System.out.println(byId);
//    }
//    @Test
//    public void InsertStu(){
//        int wang = userMapper.insertStu(new Stu("2021110408", "weijun", 20,"male","cs"));
//        System.out.println(wang);
//    }
//
//    @Test
//    public void UpdateStu(){
//        int i = userMapper.updateStu(new Stu("2021110408", "scir", 18,"male","cs"));
//        System.out.println(i);
//    }
//
//    @Test
//    public void DeleteStu() {
//        int deleteStu = userMapper.deleteStu("2021110408");
//        System.out.println(deleteStu);
//    }
//}
    @Test
    void contextLoads() {
    }

    @Autowired
    private StudentMapper StudentMapper;

    @Test
    public void SelectStu() {
        Stu byId = StudentMapper.selectStu("2021110409");
        System.out.println(byId);
    }

    @Test
    public void insertStu(){
        int i = StudentMapper.insertStu(new Stu("2021110410", "张三", 28, "男", "理科一班"));
        System.out.println(i);
    }

    @Test
    public void updateStudent(){
        int j = StudentMapper.updateStu(new Stu("2021110410", "张思", 28, "男", "理科一班"));
        System.out.println(j);
    }

    @Test
    public void deleteStudent(){
        int k = StudentMapper.deleteStu("2021110410");
        System.out.println(k);
    }
}