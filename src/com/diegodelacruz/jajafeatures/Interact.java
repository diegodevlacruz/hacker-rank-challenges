package com.diegodelacruz.jajafeatures;

public class Interact<T extends Long> {
   boolean isGreater(T first, T second){
    return (first - second) >= 0;
   }

   public static void main(String[] args) {

    Interact checklist = new Interact<>();
    System.out.println(checklist.isGreater(5L, 2L));
   }

}
