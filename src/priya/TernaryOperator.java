package priya;
public class TernaryOperator {
    public static void main(String args[])
    {
    Object o1;
    Object o2;
    if(true)
    {
        o1=new Integer(10);
    }
    else
    {
        o1=new Double(15.0);
    }
    System.out.println(o1);
    o2=true?new Integer(10):new Double(15.0);
        System.out.println(o2);
    }
}
