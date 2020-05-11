import java.util.*;
class BubbleSort 
{
  public static void main(String []args) {
    int n, c, i, temp;
    Scanner in = new Scanner(System.in);
 
    System.out.println("enter");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
   
    for (c = 0; c < ( n - 1 ); c++) {
      for (i = 0; i < n - c - 1; i++) {
        if (array[i] > array[i+1])
        {
          temp      = array[i];
          array[i]   = array[i+1];
          array[i+1] = temp;
        }
      }
    }
 
    System.out.println("n.os:");
 
    for (c = 0; c < n; c++)
      System.out.println(array[c]);
  }
}