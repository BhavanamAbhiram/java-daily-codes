import java.io.*;
import java.util.*;

 class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        int j = s2.length() - 1;
        boolean eq = true;
        
        if(s1.length()-4>=3)
        {
            for (int i = 0; i < 3 && i < s1.length(); i++) 
            {
            
            if (s1.charAt(i) != s2.charAt(j)) 
            {
                eq = false;
                break;
            }
                j--;
            }
            if(eq==true)
            {
                System.out.println("GREAT");
            }
            else
            {
                System.out.println("TRY NEXT TIME");
            }
       
        }
        else
        {
            System.out.println("ERROR");
        }
        
    }
}
