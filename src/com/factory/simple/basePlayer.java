package com.factory.simple;

abstract class basePlayer {
    public  basePlayer(){}
}

class playerNormal extends basePlayer{
    public playerNormal(){
        System.out.println("this is normal player");
    }
}

class playerRmb extends basePlayer{
    public playerRmb(){
        System.out.println("this is rmb player");
    }
}
//工厂模式的实现:1.一个产品的抽象类,抽象类的实现类
// 工厂类:返回值是抽象类的方法.
//优点:模块清晰化.让代码初步实现了可维护的状态
//缺点:不符合开闭原则.增加新的产品,需要改动工厂类的逻辑方法.

class Customer{
    public static void main(String[] args) {
// 在面向对象编程中, 最通常的方法是一个new操作符产生一个对象实例,new操作符就是用来构造对象实例的。
// 但是在一些情况下, new操作符直接生成对象会带来一些问题。举例来说, 许多类型对象的创造需要一系列的步骤:
// 你可能需要计算或取得对象的初始设置; 选择生成哪个子对象实例; 或在生成你需要的对象之前必须先生成一些辅助功能的对象。
// 在这些情况,新对象的建立就是一个 “过程”，不仅是一个操作，像一部大机器中的一个齿轮传动。
// 原文：https://blog.csdn.net/jason0539/article/details/23020989

    playerFactory pf = new playerFactory();
    pf.createPlay("rmb");
    pf.createPlay("normal");
    }
}
