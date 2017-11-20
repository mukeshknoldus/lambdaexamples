package com.knoldus;

public class SayImpl {
    // lambda expression example with no parameter
    public static void main(String[] args){
        Sayable sayable=()->{
            return "i have nothing to say:";
        };
        System.out.println(sayable.say());
    }
}
