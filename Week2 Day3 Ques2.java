import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sai= new Scanner(System.in);
        int x=sai.nextInt();
        int y=sai.nextInt();
        int z=(y*100)/x;
        if(z>=75)
        {
            System.out.println(z);
            System.out.println("Yes");
        }
        else if(z<75)
        {
            System.out.println(z);
            System.out.println("No");
        }
    }
}
