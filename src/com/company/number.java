package com.company;

public class number {
    public static int get_number(String num){
        int n;
        if(num.equals("I")){
            n = 1;
        }
        else if(num.equals("II"))
        {
            n = 2;
        }
        else if(num.equals("III"))
        {
            n = 3;
        }
        else if(num.equals("IV"))
        {
            n = 4;
        }
        else if(num.equals("V"))
        {
            n = 5;
        }
        else if(num.equals("VI"))
        {
            n = 6;
        }
        else if(num.equals("VII"))
        {
            n = 7;
        }
        else if(num.equals("VIII"))
        {
            n = 8;
        }
        else if(num.equals("IX"))
        {
            n = 9;
        }
        else if(num.equals("X"))
        {
            n = 10;
        }
        else{
           n = Integer.parseInt(num);
        }
        return n;
    }
}
