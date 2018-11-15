package com.factory.simple;

public class playerFactory {

//    多态的应用,方法的返回类型是父类.但是返回值是子类.也就是父类的引用指向子类对象
    public  basePlayer createPlay(String player){
        switch (player){

            case "normal":{
                return new playerNormal();
            }

            case "rmb":{
                return new playerRmb();
            }
        }
        return null;
    }
}
