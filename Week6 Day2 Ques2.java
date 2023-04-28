import java.util.Scanner;

class Mainn 
{
    public boolean check(int x)
    {
        if(x%2 == 0 && x%3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        Game a=new Game();
        if(x<20 || x>400)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(a.check(x))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}
