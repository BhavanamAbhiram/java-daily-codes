import java.io.*;
import java.util.*;

class Main
{
   public static void main(String[] args)
   {
      Scanner sai=new Scanner(System.in);
      double a=sai.nextDouble();
      double b=sai.nextDouble();
      double c=sai.nextDouble();
      double d=((a+b+c)/3);
     System.out.printf("%.1f",d-0.1);
  }
}
