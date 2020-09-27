package Collections;
public class EnumExample3
{
enum Mobile
{
Apple,SAMSUNG,HTC;
int price;
public int getPrice()
{
return price;
}
}
public static void main(String args[])
{

 System.out.println(Mobile.Apple.getPrice());

}
}
