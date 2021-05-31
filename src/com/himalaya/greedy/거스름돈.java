package com.himalaya.greedy;

public class 거스름돈 {

    public static void main(String[] args) {

        int[] coinTypes = {500, 100, 50, 10};
        int n = 1260;
        int count = 0;

        for (int i = 0; i < coinTypes.length; i++) {
            count += n / coinTypes[i];
            n %= coinTypes[i];
        }

        System.out.println(count);

    }
}
