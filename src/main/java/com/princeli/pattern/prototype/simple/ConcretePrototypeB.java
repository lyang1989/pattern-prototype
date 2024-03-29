package com.princeli.pattern.prototype.simple;

import java.util.List;

/**
 * @author : princeli
 * @version 1.0
 * @className ConcretePrototypeA
 * @date 2019-05-29 21:37
 * @description: TODO
 */
public class ConcretePrototypeB implements Prototype{

    private int age;

    private String name;

    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeB concretePrototypeA = new ConcretePrototypeB();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);
        return concretePrototypeA;
    }
}
