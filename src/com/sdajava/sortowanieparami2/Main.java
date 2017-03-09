package com.sdajava.sortowanieparami2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] tab = {4, 7, 8, 3, 5, 4};
        int temp;


        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {

                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
            System.out.println(Arrays.toString(tab));

        }
    }
}




