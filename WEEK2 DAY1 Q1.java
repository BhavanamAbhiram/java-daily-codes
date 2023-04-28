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
      String x=sai.nextLine(); 
      int y=Integer.parseInt(x, 2); 
      if (y<65||y>90) 
      { 
      System.out.println("INVALID PAPER CODE"); 

      } 
        else 
        { 
           System.out.println( 'E'); 
        } 
    } 
}
