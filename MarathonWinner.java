import java.util.Scanner;
public class MarathonWinner
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int c=sc.nextInt();
  int d=sc.nextInt();
  int[][] v=new int[c][d];
  int[] k=new int[c];
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<d;j++)
    {
      v[i][j]=sc.nextInt();
    }
    int dist=sc.nextInt();
    for(int j=0;j<d;j++)
    {
      v[i][j]=v[i][j]*dist;
    }
  }
  for(int s=0;s<10;s++)
  {
  }
  for(int i=1;i<d;i+=2)
  {
    int p=0,value=Integer.MIN_VALUE;
    for(int j=0;j<c;j++)
    {
      v[j][i]=v[j][i-1]+v[j][i];
      if(i!=1)
      {
        v[j][i]=v[j][i]+v[j][i-2];
      }
      if(v[j][i]>value)
      {
        p=j;
        value=v[j][i];
      }
    }
    k[p]++;
  }
  int max=Integer.MIN_VALUE,p=0;
  for(int i=0;i<k.length;i++)
  {
    if(max<k[i])
    {
      max=k[i];
      p=i;
    }
  }
  System.out.println(p+1);
}
}