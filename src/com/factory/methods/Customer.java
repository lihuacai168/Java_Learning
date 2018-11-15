package com.factory.methods;

public class Customer {
    public static void main(String[] args) {
        normalFactory normalFactory = new normalFactory();
        normalFactory.createPlayer();

        rmbFactory rmbFactory = new rmbFactory();
        rmbFactory.createPlayer();
    }
}
