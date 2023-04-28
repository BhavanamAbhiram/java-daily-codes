import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main
{

    public static void main(String[] args) 
    {
    Scanner sai=new Scanner(System.in);
    String s=sai.nextLine();
    switch(s)
    {
        case "Android":
            {
                System.out.println("Md. Adil Khan"+" "+"3");
            }
            break;         
        case "Java":
             {
                System.out.println("Shruti"+" "+"4");
             }
                break;     
        case "OS":
            {
                  System.out.println("Puneeth Kumar"+" "+"3");
            }
            break; 
            case "AI":
            {
                System.out.println("James William"+" "+"2");
            }
            break; 

        default :
        {
            System.out.println("This subject is not running in this semester.");
        }
        break;
    }
    }
}
