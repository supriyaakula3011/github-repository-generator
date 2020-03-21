public class Armstrong {
    public static void main(String[] args) {
        int s=0,r,n=153;
        int t=n;
            while(n>0)
            {
                r=n%10;
                n=n/10;
                s=s+r*r*r;
            }
            if(t==s)
             System.out.println("Armstrong number");
            else
                System.out.println("not Armstrong");
    } 
}
