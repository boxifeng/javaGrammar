package com.becc.api.test;

import java.util.Scanner;

public class Demo02Scanner {
    public static void main(String[] args) {
        System.out.println(getMaxInt());
    }

    /**
     * 返回键盘输入的三个int中最大的数字
     * @return
     */
    public static int getMaxInt() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int temp = (i <= j) ? j : i;
        temp = (temp <= k) ? k : temp;
        return temp;
    }
}
