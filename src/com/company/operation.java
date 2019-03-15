package com.company;

public class operation {
    public static int math_operation(int a, int b, String x){
        int c = 0;
        if(x.equals("+")){
            c = a + b;
        }
        else if(x.equals("-"))
        {
            c = a - b;
        }
        else if(x.equals("*"))
        {
            c = a * b;
        }
        else if(x.equals("/"))
        {
            c = a / b;
        }
        return c;
    }
}
