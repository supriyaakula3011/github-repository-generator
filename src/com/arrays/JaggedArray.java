package com.arrays;
public class JaggedArray {
  public static void main(String args[])
    {
        int a=2,b=6,c=7,d=9;
        int x[]={2,3,4,5};
        int y[]={4,2};
        int z[]={2,1,3};
        int p[][]={{2,3,4,5},{4,2},{2,1,3}};
        int k[][]=new int[3][];
        k[0]=new int[1];
        k[1]=new int[3];
        k[2]=new int[5];
        
    for(int i[]: p)
    { 
        for(int j :i)
    {
        System.out.print(j+" ");
    }
        System.out.println("");
    } 
    }
}