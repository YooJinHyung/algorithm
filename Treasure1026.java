package com.study.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by User on 2017-10-01.
 */
public class Treasure1026 {
    public void solve(){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int cycle = input.nextInt();
        int result = 0;
        for(int i =0 ; i< cycle; i++){
            a.add(input.nextInt());
        }
        for(int i =0 ; i< cycle; i++){
            b.add(input.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        for(int i =0 ; i< cycle; i++){
            result+=a.get(i)*b.get(cycle-i-1);
        }
        System.out.println(result);
    }
}
