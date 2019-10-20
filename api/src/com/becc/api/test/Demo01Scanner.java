package com.becc.api.test;

import java.util.Scanner;

/**
 * 键盘输入两个数字，输出和值
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum(sc);
    }

    /**
     * 求两个int类型的和
     * @param sc
     */
    public static void sum(Scanner sc) {
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = i + j;
        System.out.println("输出的和为" + k);
    }
}
