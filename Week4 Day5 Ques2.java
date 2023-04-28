import java.io.*;
import java.util.*;

 class Main
{
        public static void main(String[] args) 
        {
             Scanner sai=new Scanner(System.in);
            String []m=new String [4];
            String []n=new String [4];
            int c=0;
            for(int i=0;i<4;i++)
            {
                 m[i]=sai.next();
            }
            for(int i=0;i<4;i++)
            {
                n[i]=sai.next();
            }
            for(int i=0;i<4;i++)
            {
                 for(int j=0;j<4;j++)
                 {
                        if((m[i].equals(n[j])))
                        {
                             c++;
                        }
                 }
            }
            System.out.println(c);
            }
}
