package com.factory.abstracted;

public class Test {
    public static void main(String[] args) {
//        lowEnemyAndNormalPlayer
        lowEnemyAndNormalPlayer lowEnemyAndNormalPlayer = new lowEnemyAndNormalPlayer();
        lowEnemyAndNormalPlayer.createEnemy();
        lowEnemyAndNormalPlayer.createPlayer();

//        highEnemyAndPlayer
        highEnemyAndPlayer highEnemyAndRmbPlayer = new highEnemyAndPlayer();
        highEnemyAndRmbPlayer.createEnemy();
        highEnemyAndRmbPlayer.createPlayer();

    }
}
