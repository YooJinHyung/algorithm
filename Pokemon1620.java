package com.study.beakjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by User on 2017-09-25.
 */
public class Pokemon1620 {
    public void solve(){
        Scanner input = new Scanner(System.in);
        int cycle = input.nextInt();
        int numOfQuestion = input.nextInt();
        HashMap<Integer,String> nameBook = new HashMap<>();
        HashMap<String,Integer> numberBook = new HashMap<>();
        input.nextLine();
        for(int i = 1;i<=cycle;i++){
            String pokemonName = input.nextLine();
            nameBook.put(i,pokemonName);
            numberBook.put(pokemonName,i);
        }
        for(int i =0; i<numOfQuestion;i++){
            String value = input.nextLine();
            if(checkNumOrString(value))
                System.out.println(nameBook.get(Integer.parseInt(value)));
            else
                System.out.println(numberBook.get(value));
        }
        input.close();
    }

    public boolean checkNumOrString(String line){
        if('0'<=line.charAt(0)&&'9'>=line.charAt(0))
            return true;
        else
            return false;
    }
}
