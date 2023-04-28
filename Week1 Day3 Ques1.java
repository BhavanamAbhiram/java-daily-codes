import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        long n=sai.nextLong();
        sai.nextLine();
        String name=sai.nextLine();
        char gender=sai.next().charAt(0);
        sai.nextLine();
        int b=sai.nextInt();
        if(b>=20000)
        {
            if(gender=='F')
            {
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+b+".");
            }
            else
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+b+".");
            }
        }
        else
        {
            if(gender=='F')
            {
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+(20000-b)+".");
            }
            else
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+(20000-b)+".");
            }
       }
    }
}
