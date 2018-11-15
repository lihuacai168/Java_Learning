package com.factory.methods;

abstract class basePlayer {
    public  basePlayer(){}
}

class playerNormal extends basePlayer{
    public playerNormal(){
        System.out.println("this is normal player from methods factory");
    }
}

class playerRmb extends basePlayer{
    public playerRmb(){
        System.out.println("this is rmb player from methods factory");
    }
}