package com.knoldus;

/**
 * Created by knoldus on 20/11/17.
 */
public class Sayable1Impl {
    
    public static void main(String[] args){
        //lambda expression using single parameter
        Sayable1 sayable1= (name)->{
        return "Hello,"+name;
        };
        System.out.println(sayable1.say1("Mukesh:"));
        
        // we can ommit the function parentheses
        Sayable1 sayable2= name->{
            return "Hello,"+name;
        };
        System.out.println(sayable2.say1("Sumit:"));
    }
}
