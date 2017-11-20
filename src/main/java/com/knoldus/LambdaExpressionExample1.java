package com.knoldus;

public class LambdaExpressionExample1 {
    public static  void  main(String[] args)
    {
        final int width =10;
        
        //without lambda expression
        /*Drawable drawable= new Drawable() {
            @Override
            public void draw(){System.out.println("Drawing:"+width);}
            };
        drawable.draw();
        }*/
        
        
        // with lambda expression
        Drawable d2= ()->{
            System.out.println("Drawing:"+width);
        };
        d2.draw();
    }
}
