import java.util.*;
public class Fibonacci { 
    public static void main(String[] args) {
        int f3,f0=1,f1=1;
        Scanner sc=new Scanner(System.in);
        f3=0;
            System.out.println("enter n.o ");
            int n=sc.nextInt();
            System.out.print("1 1 ");
            while(f3<=n)
            {
            f3=f0+f1;
            if(f3>=n)
                break;
            System.out.print(f3+" ");
            f0=f1;
            f1=f3;
       }
    } 
}
