package com.knoldus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by knoldus on 20/11/17.
 */
public class LambdaExampleForEach {
    public static  void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("mukesh");
        list.add("ankit");
        list.add("sumit");
        list.add("raj");
        list.add("deepak");
        list.add("jai");
        
        list.forEach((n)->System.out.println(n));
    }
}
