package org.haut.bean;

public class Student {
    private String id;
    private String name;
    private Grade grade;
    public Student(String id, String name, Grade grade) {
        System.out.println("参数为：" + id + "," + name + "," + grade);
        this.id = id;
        this.name = name;
        this.grade = grade;

    }
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setId(String id) {
        System.out.println("正在执⾏ Student类的setId⽅法…… ");
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("正在执⾏ Student的setName类⽅法…… ");
        this.name = name;
    }

    public void setGrade(Grade grade) {
        System.out.println("正在执⾏ Student的setGrade类⽅法…… ");
        this.grade = grade;
    }
}
