import java.util.Scanner;
class Matrix
{
  public static void main (String args[])
  {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the square matrix:");
    int size = sc.nextInt(), lsum =0, rsum =0;
    int [][]a = new int [size][size];
     for (int i=0; i<size; i++)
    {
      for (int j=0; j<size;j++)
      {
        a[i][j] = sc.nextInt();
      }
    }
    for (int i=0; i<size; i++)
    {
      for (int j=0; j<size;j++)
      {
        if (i==j)
          lsum = lsum + a[i][j];
         
        else if ((i+j)==(size-1))
         rsum = rsum + a[i][j];
         
        else
          continue;
      }
    }
     
    System.out.println ("Left Diagonal Sum= "+lsum);
    System.out.println ("Right Diagonal Sum= "+rsum);                    
  }
}