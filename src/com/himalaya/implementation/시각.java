package com.himalaya.implementation;

import java.util.Scanner;

public class 시각 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // H 입력 받기
        int h = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }

    //특정 시각 안에 '3'이 포함되어 있는지 여부
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
            return true;
        }
        return false;
    }
}
