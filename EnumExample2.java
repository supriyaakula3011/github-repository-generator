package Collections;
public class EnumExample2
{
enum Mobile
{
Apple,SAMSUNG,HTC;
}
public static void main(String args[])
{
Mobile m= Mobile.Apple;
switch(m)
{
 case Apple:
          System.out.println("Apple is best");
		  break;
 case SAMSUNG:
           System.out.println("SAMSUNG is best");
		  break;
case HTC:
         System.out.println("SAMSUNG is best");
		 break;
}
          
}
}
