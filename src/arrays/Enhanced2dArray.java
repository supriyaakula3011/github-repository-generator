package arrays;
public class Enhanced2dArray {
  public static void main(String args[])
    {
        int a=2,b=6,c=7,d=9;
        int x[]={2,3,4,5};
        int y[]={4,2,4,7};
        int z[]={2,1,3,6};
        int p[][]={{2,3,4,5},{4,2,4,7},{2,1,3,6}};
    for(int i[]: p)
    { 
        for(int j :i)
    {
        System.out.print(j);
    }
        System.out.println("");
    } 
    }
}
