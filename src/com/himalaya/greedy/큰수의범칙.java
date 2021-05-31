package com.himalaya.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의범칙 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // n개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수 정렬하기
        int first = arr[n - 1];
        int second = arr[n - 2];

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first;
        result += (m - cnt) * second;

        System.out.println(result);

    }
}
