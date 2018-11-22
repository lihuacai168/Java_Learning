package com.practice;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        //实现思路:先区分中奖和不中奖;
        //中奖再判断第几次中奖的
        //不中奖的时候,判断输入的数字和要猜的数字大小.给出提示.
        
        //random生成[0.0,1.0)的double随机数
        //*100,变成[0,99]的double
        //%9,取模变成[0,8]的double
        //+1,然后(int),,变成int类型,范围是[0,9]
        final int guess_num = (int) (((Math.random() * 100)%9)+1)*1000;//用户要猜的数字
        System.out.println(guess_num);
        //用户猜的次数

        int count = 0;
        int use_num = -1;
        String bonusName = null;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入神秘数字: "+ ++count +"次");
            use_num = new Scanner(System.in).nextInt();
            if (use_num == guess_num ){
                switch (count){
                    case 1:
                        bonusName = "一等奖";
                        break;
                    case 2:
                        bonusName = "二等奖";
                        break;
                    case 3:
                        bonusName = "三等奖";
                        break;
                    default:
                        bonusName = "安慰奖";
                }
                break;
            }
            else {
                System.out.println("错了哦,请继续");
            }
        }


        if(bonusName == null){
            System.out.println("很遗憾,5次都没中奖");
        }
        else {
            System.out.printf("恭喜你中了%s\n",bonusName);

        }



    }
}
