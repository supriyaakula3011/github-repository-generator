public class Prime{    
 public static void main(String args[])
 {    
  int i,flag=0;      
  int n=3;
  if(n==0||n==1){  
   System.out.println("not prime number");      
  }
  else
  {  
   for(i=2;i<=n/2;i++){      
    if(n%i==0){      
     System.out.println("not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  
       System.out.println("prime number"); 
  }
}    
}   
