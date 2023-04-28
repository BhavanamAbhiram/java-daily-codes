import java.io.*;
import java.util.*;

class Main
{

    public static void main(String[] args) 
    {
       Scanner saukanya=new Scanner(System.in);
        String day=sukanya.nextLine();
        switch(day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednsday":
            case "Thursday":
            case "Friday":
                    System.out.println("8:30 5:30");
                    break;
            case "Saturday":
                    System.out.println("9:30 4:30");
            break;
            default:
                  System.out.println("Library is closed");    
                break;
        }
    }
}
