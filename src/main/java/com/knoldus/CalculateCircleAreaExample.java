package com.knoldus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by knoldus on 22/11/17.
 */
public class CalculateCircleAreaExample {
    public static void main(String[] args){
        int radius=0;
        System.out.println("please enter radius of the circle");
        
       // get the radious from the console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            radius = Integer.parseInt(bufferedReader.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Double area = Math.PI*radius*radius;
        System.out.println("Area of circle is:"+area);
    }
}
