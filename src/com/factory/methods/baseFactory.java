package com.factory.methods;

//定义工厂抽象类
abstract class baseFactory {

//    定义抽象工厂的抽象方法,返回值是产品的抽象类型
    public abstract basePlayer createPlayer();
}

//实现抽象工厂
class normalFactory extends baseFactory{

//    重写抽象工厂的抽象方法,并且返回值是产品的实例类型.
    @Override
    public playerNormal createPlayer() {
        return new playerNormal();
    }
}

class rmbFactory extends baseFactory {

    //    重写抽象工厂的抽象方法,并且返回值是产品的实例类型.
    @Override
    public playerRmb createPlayer() {
        return new playerRmb();
    }
}