public class Perfect {
    public static void main(String[] args) {
        int n=6;
            boolean b=isPerfect(n);
            if(b)
             System.out.println("Perfect number");
            else
             System.out.println("not perfect");
    } 
    public static boolean isPerfect(int n)
    {
        int s=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                s=s+i;
        }
        if(n==s)
            return true;
            return false;
    }
}
