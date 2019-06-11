package com.princeli.pattern.prototype.test;

import com.princeli.pattern.prototype.deep.QiTianDaSheng;

/**
 * @author : princeli
 * @version 1.0
 * @className DeepCloneTest
 * @date 2019-06-11 21:39
 * @description: TODO
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {

            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆： "+ (qiTianDaSheng.jinGuBang == clone.jinGuBang));

        }catch (Exception e){
            e.printStackTrace();
        }


        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆： "+ (q.jinGuBang == n.jinGuBang));
    }
}
