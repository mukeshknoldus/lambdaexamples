package com.knoldus;

public class Addable2Impl {
    public static void main(String[] args){
        //multiple parameters in lambda expression
        Addable2 addable2=(a,b)->{
            return a+b;
        };
        System.out.println(addable2.add(10, 20));
        
        //we can also ommit curly parenthesis if it is single line code
        //return statement is optional in case of single statement in lambda expression
        Addable2 addable3=(a,b)->(a+b);
        System.out.println(addable3.add(05,07));
    }
}
