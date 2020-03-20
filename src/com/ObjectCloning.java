package com;
public class ObjectCloning {
    public static void main(String args[]) throws CloneNotSupportedException
{
    B obj=new B();
    obj.i=3;
    obj.j=4;
    B obj1=(B)obj.clone();
    obj1.j=8;
    System.out.println(obj);
    System.out.println(obj1);
}
}
class B implements Cloneable
{
    int i;
    int j;

    @Override
    public String toString() {
        return "Abc{" + "i=" + i + ", j=" + j + '}';
    }  
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}