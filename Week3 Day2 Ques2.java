import java.util.Scanner;


class Main
{
    public static void main(String[] args)
    {
        Scanner abhi= new Scanner(System.in);
        int x=abhi.nextInt();
            if(x<0)
            {
                System.out.println("Invalid Input");
            }
        else if(x>0)
        {
            int y=1;
            for(int z=0;z<x;z++)
            {
                for(int a=0;a<y;a++)
                {
                    System.out.print("&");
                }
                y++;
                System.out.println();
            }
        }
    }
}
