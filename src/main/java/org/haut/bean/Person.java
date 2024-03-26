package org.haut.bean;
import java.util.*;
public class Person {
    private String name;
    private String[] arr;
    private List<String> myList;
    private Map<String,String> myMap;
    private Set<String> mySet;
    private Properties myPro;


    public void setName(String name) {
        this.name = name;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyPro(Properties myPro) {
        this.myPro = myPro;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                ", myList=" + myList +
                ", myMap=" + myMap +
                ", mySet=" + mySet +
                ", myPro=" + myPro +
                '}';
    }
}
