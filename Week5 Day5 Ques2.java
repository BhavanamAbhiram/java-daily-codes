import java.io.*;
import java.util.*;


class Main
{
     public static boolean isBigger(int a,int b){
         if(a>b){
             return true;
         }
         else{
             return false;
         }
     }

    public static void main(String[] args) 
    {
        

        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        boolean c= isBigger(a,b);
        System.out.println(c);
    }
}
