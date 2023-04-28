import java.io.*;
import java.util.*;

class Main
{
      public static void main( String args[] )
      { 
        Scanner abhi=new Scanner( System.in ); 
        int num=abhi.nextInt(); 
       int n=(int) Math.round(Math.pow(num,1.0/3.0));
        if((num==n*n*n))
            {
               System.out.print("Perfect Cube");
            }
           else
            {
                System.out.print("Not Perfect Cube");
            }
       }
}
