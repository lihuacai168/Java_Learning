package com.practice;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        //统计个人贡献值,为负数的时候就退出,并统计

        int exp;//个人贡献值

        int sum = 0;//个人总贡献度

        while (true){
            System.out.println("请输入本次的贡献度:");
            exp = new Scanner(System.in).nextInt();
            if (exp < 0){
                //贡献度小于零就退出
                break;
            }
            else {
                sum =+ exp;
            }
        }
        System.out.println("本次总贡献值是:"+sum);
    }
}
