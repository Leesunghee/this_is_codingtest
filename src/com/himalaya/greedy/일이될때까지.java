package com.himalaya.greedy;

import java.util.Scanner;

public class 일이될때까지 {
    public static void main(String[] args) {

        // N, K를 공백으로 구분하여 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

//        while (true) {
//            if ((n % k) == 0) {
//                n /= k;
//            } else {
//                n -= 1;
//            }
//            count++;
//            if (n == 1) break;
//        }
        while (true) {

            int target = (n / k) * k;
            count += (n - target);
            n = target;
            n /= k;
            count++;

            if (n < k) break;
        }
        count += (n - 1);
        System.out.println(count);
    }
}
