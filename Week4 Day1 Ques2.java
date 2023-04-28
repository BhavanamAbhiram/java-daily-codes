
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sukanya =new Scanner(System.in);
        int n=sukanya.nextInt();
        int a[]=new int[5];
        int sum=0;
        if(n>0)
        {
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();  
        }
         for(int i=0;i<n;i++)
         {
             sum=sum+a[i];
         }
        System.out.print(sum);  
    }
    else
    {
                System.out.print("Invalid");

    }
    }
}
