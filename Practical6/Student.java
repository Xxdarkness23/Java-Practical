/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

public class Student {
    private String name,adminNo,course;
    private int age;
    
    //must be private so it cannot be accessed by non private functions

    public Student(String name, String adminNo, String course, int age) {
        this.name = name;
        this.adminNo = adminNo;
        this.course = course;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getStudentInfo() {
        return "Name: " + name + "\nAdmin#" + adminNo+  "\nCourse:" 
                + course + "\nAge: " + age;
    }
    
}
