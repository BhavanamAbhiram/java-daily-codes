import java.io.*;
import java.util.*;

class Main 
{

    public static void main(String[] args) 
    {
        Scanner sukanya=new Scanner(System.in);
        int n=sukanya.nextInt();  int p=0;
        int[][] ar=new int[n][7];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<7;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<7;j++)
            {
                p=p+ar[i][j];
            }

            if(p==56){
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}
