package com.study.algorithm.daily170514;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 2017-05-14.
 */
public class ShortPathTest {

    @Test
    public void test_case1() {
        int[] input = {1,3,4,8,13,17,20};

        String result = getShortestLength(input);

        assertEquals("(3, 4)",result);
    }

    @Test
    public void test_case2() {
        int[] input = {1, 2, 3};

        String result = getShortestLength(input);

        assertEquals("(1, 2)",result);
    }

    public String getShortestLength(int[] input)
    {
        int dot1=0;
        int dot2=0;
        int shortest=Integer.MAX_VALUE;
        for(int i=0;i<input.length-1;i++)
        {
            if(input[i+1]-input[i] < shortest)
            {
                dot1 = input[i+1];
                dot2 = input[i];
                shortest = dot1-dot2;
            }
        }

        return "("+ dot2 +", "+dot1+")";
    }

}
