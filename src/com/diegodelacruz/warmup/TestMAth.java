package com.diegodelacruz.warmup;

public class TestMAth {
    
    public static void main(String[] args) {
        MathInt myMath = (value1, value2) -> value1 + value2;
        System.out.println(myMath.DoMath(5,6));
        System.out.println(myMath.Truncate(5,6));
    }
}


