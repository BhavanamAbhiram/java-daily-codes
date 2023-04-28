import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main
{
    public static boolean canBePalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return isPalindrome(str,i+1,j)||isPalindrome(str,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalindrome(String str,int i,int j)
    {
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        if(1<=str.length()||str.length()<=1000)
        {
            System.out.println(canBePalindrome(str)); 
        }
        else
        {
        System.out.println("Invalid Input");
        }
    }
}
