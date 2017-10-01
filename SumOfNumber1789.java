package com.study.beakjoon;

import java.util.Scanner;

/**
 * Created by User on 2017-09-23.
 */
public class SumOfNumber1789 {
    public void solve(){
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long i,summary=0;
        for(i=0;number>summary;i++){
            summary+=i;
            if(summary==number)
                i++;
        }
        i-=2;
        System.out.println(i);
        input.close();
    }
}
