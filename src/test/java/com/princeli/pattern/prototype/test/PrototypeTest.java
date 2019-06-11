package com.princeli.pattern.prototype.test;

import com.princeli.pattern.prototype.simple.Client;
import com.princeli.pattern.prototype.simple.ConcretePrototypeA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : princeli
 * @version 1.0
 * @className PrototypeTest
 * @date 2019-05-29 21:48
 * @description: TODO
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("tom");
        List hobbies = new ArrayList<String>();
        concretePrototypeA.setHobbies(hobbies);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA)client.startClone(concretePrototypeA);
        System.out.println(copy);

        System.out.println("克隆对象中都引用类型地址的值"+copy.getHobbies());
        System.out.println("原对象中都引用类型地址的值"+concretePrototypeA.getHobbies());
        System.out.println("对象地址比较:"+(copy.getHobbies() == concretePrototypeA.getHobbies()));



    }
}
