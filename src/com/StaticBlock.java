package com;
public class StaticBlock {
    static String s="";
    static
    {
        s="static block";
    }
     public static void main(String args[]) 
        {
         System.out.println("value for s : "+s);    
        }   
}
        
