import java.util.Scanner;
    
interface Main 
{
  boolean valid(String str, int n);
}

class Solution
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    int n = input.nextInt();

    Validator validator = (s,i)->s.length()>i;

    if (n<1) 
        {
            System.out.println("Invalid input");
        } 
      else if (validator.valid(str, n)) 
        {
            System.out.println("Valid string");
        } 
      else
        {
            System.out.println("Invalid string");
        }
  }
}
