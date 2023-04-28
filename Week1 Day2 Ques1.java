import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        int i,j,k=0;
        Scanner abhi=new Scanner(System.in);
        
         i=abhi.nextInt();
        for(j=2;j<i;j++)
        {
    if((i%j)==0)
    {
       k=1;
    }
        }
        if(k==1)
        {
            System.out.println("Not Prime Number");
        }
        else
        {
            System.out.println("Prime Number");
        }
    }
}
