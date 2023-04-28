import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sai=new Scanner(System.in);
        int m=sai.nextInt();
        int n=sai.nextInt();
        int p=sai.nextInt();
        if((m==0)||(n==0)||(p==0))
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int x=m*10;
            x=x/100;
            m=m-x;
            int y=n*20;
            y=y/100;
            n=n-y;
            int z=p*30;
            z=z/100;
            p=p-z;
            if(m!=9000)
            System.out.println((m+(2*n)+(3*p)));
            else
            System.out.println(m-(8*x)+(2*(n-(3*y)))+(3*(p-(4*z/3))));
        }
    }
}
