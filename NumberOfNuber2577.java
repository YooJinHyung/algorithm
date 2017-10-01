package com.study.beakjoon;

import java.util.Scanner;

/**
 * Created by User on 2017-09-22.
 */
public class NumberOfNuber2577 {
    public void solve(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int result = num1*num2*num3;
        int index = 0;
        int[] check = {0,0,0,0,0,0,0,0,0,0};
        for(;result!=0;result/=10) {
            index = result%10;
            check[index]++;
        }
        for(index=0;index<10;index++)
            System.out.println(check[index]);
    }
}
