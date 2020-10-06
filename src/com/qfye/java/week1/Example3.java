package com.qfye.java.week1;

import java.util.Scanner;

/**
 * @ClassName Example3
 * @Description TODO
 * @Author QIAN-feng
 * @Date 2020/10/7
 **/
public class Example3 {
    public static void main(String[] args) {
        System.out.println("用空格做分隔符，输入若干个数，最后输入#结束，\n然后回车确认.");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNext()){
            double x = reader.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为"+ sum);
        System.out.println(m+"个数的平均值"+sum/m);
    }

}
