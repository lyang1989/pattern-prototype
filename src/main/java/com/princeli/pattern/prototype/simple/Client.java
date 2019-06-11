package com.princeli.pattern.prototype.simple;

/**
 * @author : princeli
 * @version 1.0
 * @className Client
 * @date 2019-05-29 21:49
 * @description: TODO
 */
public class Client {
//    private Prototype prototype;
//
//    public Client(Prototype prototype){
//        this.prototype = prototype;
//    }


    public Prototype startClone(Prototype prototype){
        return  prototype.clone() ;
    }
}
