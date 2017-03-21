package com.example.daou.week6_hw;

/**
 * Created by daou on 2017-03-17.
 */

public class Profile {
     String name;
     String age;

    public Profile(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
