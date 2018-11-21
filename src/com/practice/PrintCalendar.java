package com.practice;

public class PrintCalendar {
    public static void main(String[] args) {
        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun");

        //从星期三开始算第一天.前面两天需要先打印
        System.out.print("\t\t");

        int dayOfMonth = 30;

        for(int i=1;i<=dayOfMonth;i++){

            //补齐前面已经过去的两天,第五天就要换行.
            if((i+2)%7==0){
                System.out.print(i+"\n");
            }
            else{
                System.out.print(i+"\t");
            }
        }
    }
}
