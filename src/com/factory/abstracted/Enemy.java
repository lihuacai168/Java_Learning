package com.factory.abstracted;

public interface Enemy {

}

class enemyLow implements Enemy{
    public enemyLow(){
        System.out.println("abstract factory low enemy");
    }
}

class enemyHigh implements Enemy{
    public enemyHigh(){
        System.out.println("abstract factory high enemy");
    }
}