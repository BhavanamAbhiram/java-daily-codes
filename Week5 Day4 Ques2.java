
import java.util.Scanner;

class Main 
{

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String[] array = new String[n];
        for (int i=0;i<n;i++) 
        {
            array[i] = input.next();
        }
        int numIntegers = 0;
        int numStrings = 0;
        for (int i=0;i<n;i++) 
        {
            if (array[i].matches("\\d+")) 
            { 
                numIntegers++;
            } 
            else 
            {
                numStrings++;
            }
        }
        System.out.println(numIntegers);
        System.out.println(numStrings);
    }
}
