package com.diegodelacruz.warmup;

@FunctionalInterface
interface MathInt {
    int DoMath(int value1, int value2);

    default String Truncate(int value1, int value2){
        Integer out = value1 + value2;
        return out.toString().substring(0,1);
    }
}
