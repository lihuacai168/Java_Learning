package com.factory.abstracted;

//factory interface for createe two productions
public interface playerAndEnemyFactory {

    basePlayer createPlayer();

    Enemy createEnemy();
}

// first type factory for two productions
class lowEnemyAndNormalPlayer implements playerAndEnemyFactory{

    @Override
    public playerNormal createPlayer() {
        return new playerNormal();
    }

    @Override
    public enemyLow createEnemy() {
        return new enemyLow();
    }
}

//second type factory for two different productions 
class highEnemyAndPlayer implements playerAndEnemyFactory{

    @Override
    public playerRmb createPlayer() {
        return new playerRmb();
    }

    @Override
    public enemyHigh createEnemy() {
        return new enemyHigh();
    }
}