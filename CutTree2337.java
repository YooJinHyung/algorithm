package com.study.beakjoon;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by User on 2017-09-25.
 */
public class CutTree2337 {
    public void solve(){
        int[][] tree;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        HashMap<Integer,Integer> treeNodes = new HashMap<>();
        tree = new int[n][n];
        for(int i= 0 ; i<n;i++){
            for(int j=0 ; j<n;j++)
                tree[i][j]=0;
        }
        for(int i=1 ; i<n ; i++){
            int strNode = input.nextInt();
            int endNode = input.nextInt();
            treeNodes.put(strNode,endNode);
        }
    }
}
