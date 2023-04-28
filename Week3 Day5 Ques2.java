import java.io.*;
import java.util.*;

class Main
{

    public static void main(String[] args) 
    {
        Scanner sai=new Scanner(System.in);
        int a=sai.nextInt();
        if(a>=0)
        {
            for(int b=0;b<a+1;b++)
            {
                System.out.println(b);
            }
            System.out.println("Games End");
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
    }
}
