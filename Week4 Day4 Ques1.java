import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sai= new Scanner(System.in);
        int n=sai.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++) 
        {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
