import java.io.*;
import java.util.*;

class Main
 {

    public static void main(String[] args) 
    {
        Scanner abbi=new Scanner(System.in);
        double a=abbi.nextDouble();
        int b=abbi.nextInt();
        if(b==1)
        {
            double c=sc.nextDouble();
            a=a-c;
            System.out.printf("%.2f",a);
        }
        else if(b==2)
        {
            double c=sc.nextDouble();
            a=a+c;
            System.out.printf("%.2f",a);
        }
        else
        {
            System.out.print("Error");
        }
    }       
}
