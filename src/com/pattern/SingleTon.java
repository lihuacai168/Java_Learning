package com.pattern;

public class SingleTon {

    private static SingleTon instance ;


    //把构造方法私有化,不让其他人直接创建类的实例
    private SingleTon(){}

    //定义一个类型实例变量
    //如果实例为空就创建,否则就返回已存在的实例
    //加上synchronized实现线程安全
    public static synchronized SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
            }
        return instance;
    }
    void inner(){
        System.out.println("单例类的方法");
    }

}

class TestSinglePattern{
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        if (singleTon == singleTon2){
            System.out.println("实例1:,%s"+singleTon);
            System.out.println("实例2:"+singleTon2);
            System.out.println("两个实例的内存地址一样,所以是单例模式");
        }
    }
}
