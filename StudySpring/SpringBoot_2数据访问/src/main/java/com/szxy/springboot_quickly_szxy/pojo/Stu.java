package com.szxy.springboot_quickly_szxy.pojo;

public class Stu {
    //定义属性
    private String id;
    private String name;
    private int age;
    private String gender;
    private String clazz;

    public Stu(String id, String name, int age, String gender, String clazz) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.clazz = clazz;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Stu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }




}
