package com.ysj.domain;

/**
 * @Author:
 * @Created Date:10:01 下午 2020/4/14
 * @Description:
 */
public class Student {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("zhangsan");
//        System.out.println(student.getName());
//    }
}
