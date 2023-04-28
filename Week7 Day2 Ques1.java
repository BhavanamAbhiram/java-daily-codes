import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
         if(password.length()<=1)
        {
            System.out.println("Wrong Input");
            return;
        }

        String pythonCase = password.toLowerCase().replace(" ", "$");
        System.out.println(pythonCase);
    }
}
