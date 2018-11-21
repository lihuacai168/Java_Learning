package com.factory.abstracted;

public interface basePlayer {

}

class playerNormal implements basePlayer{
    public playerNormal(){
        System.out.println("abstract factory normal player");
    }
}

class playerRmb implements basePlayer{
    public playerRmb(){
        System.out.println("abstract factory RMB player");
    }
}


