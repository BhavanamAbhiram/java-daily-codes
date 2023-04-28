import java.io.*;
import java.util.*;

      class Main
{
    public static void main(String[] args)
    {
        Scanner sai= new Scanner(System.in);
        double x=sai.nextDouble();
        int y=(int)x;
            if(x>0)
            {
                System.out.println(y);
            }
            if(x<0)
            {
                System.out.println("Invalid Input");
            }
    }
}
