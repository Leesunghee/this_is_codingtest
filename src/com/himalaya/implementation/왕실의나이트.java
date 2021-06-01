package com.himalaya.implementation;

import java.util.Scanner;

public class 왕실의나이트 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        int x = inputData.charAt(0) - 'a' + 1;
        int y = inputData.charAt(1) - '0';
        int cnt = 0;

        int[] dx = {-2, -2, 2, 2, 1, -1, 1, -1};
        int[] dy = {1, -1, 1, -1, -2, -2, 2, 2};

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 1 || nx > 8 || ny < 1 || ny > 8) continue;
            cnt++;
        }

        System.out.println(cnt);
    }
}
