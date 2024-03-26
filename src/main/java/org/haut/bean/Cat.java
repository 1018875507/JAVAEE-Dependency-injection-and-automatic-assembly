package org.haut.bean;

import org.springframework.beans.factory.annotation.Value;

public class Cat {


    private Integer id;
    private String name;
    public void shout(){
        System.out.println("喵喵");
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
