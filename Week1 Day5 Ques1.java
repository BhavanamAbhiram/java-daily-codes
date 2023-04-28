import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) 
    {
       Scanner abhi=new Scanner(System.in);
        int a=abhi.nextInt();
        int b=abhi.nextInt();
        if((a<0)||(b<0))
        {
        System.out.println("0");
        }
        else
        {
            System.out.println((a*4)+(b*6));
        }
    }
}
