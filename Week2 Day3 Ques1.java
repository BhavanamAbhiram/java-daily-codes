import java.util.Scanner;

class aAin
{
    public static void main(String[] args)
    {
        Scanner sai= new Scanner(System.in);
        int a=sai.nextInt();
        Double b=sai.nextDouble();
        if(a==1)
        {
            b=(b-32) * 5/9;
            System.out.format("%.2f",b);
        }
         else if(a==2)
         {
             b=(b*9/5)+32;
             System.out.println(b);
         }
         else
         {
             System.out.println("INVALID CHOICE");
         }
    }
}
