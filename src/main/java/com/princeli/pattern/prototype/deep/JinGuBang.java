package com.princeli.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @author : princeli
 * @version 1.0
 * @className JinGuBang
 * @date 2019-06-11 21:23
 * @description: TODO
 */
public class JinGuBang implements Serializable {

    public float h = 100;
    public float d = 10;


    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }



}
