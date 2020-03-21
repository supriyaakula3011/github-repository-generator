package string;
public class StringMutable {
      public static void main(String args[])
      {
          StringBuffer sb=new StringBuffer("supriya");
          sb.append(" akula");
          sb.replace(0, 5, "priya");
          sb.delete(4, 6);
      System.out.println(sb);
      }   
}
