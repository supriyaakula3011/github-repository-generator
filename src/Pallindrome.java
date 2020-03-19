import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        int r=0,d;
        Scanner sc=new Scanner(System.in);
            System.out.println("enter n.o ");
            int n=sc.nextInt();
            int t=n;
            while(n>0)
            {
                d=n%10;
                n=n/10;
                r=r*10+d;
            }
            if(t==r)
             System.out.println("Pallindrome");
            else
                System.out.println("not pallindrome");
    } 
}
