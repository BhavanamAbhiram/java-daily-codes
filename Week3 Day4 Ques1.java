import java.io.*;
import java.util.*;

class Main
{

    public static void main(String[] args) {
        Scanner abhi=new Scanner(System.in);
        int a=abhi.nextInt();
        int i;
        for(i=a+1;i>=0;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
