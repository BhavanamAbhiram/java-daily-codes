import java.util.Scanner;

class Main
{
    int id;
    int age;

    Employee(int id, int age) 
    {
        this.id = id;
        this.age = age;
    }
}
public class Emp
{
    public static void main(String[] args) 
    {
        Scanner sai =new Scanner(System.in);
        int n=sai.nextInt();
        if (n<1||n>10) 
        {
            System.out.println("Invalid input");
        }
        else 
        {
            Employee[] emp = new Employee[n];
            for (int i=0;i<n;i++) 
            {
                int id = sai.nextInt();
                int age = sai.nextInt();
                emp[i] = new Employee(id, age);
            }
            for (int i = 0; i < n; i++) 
            {
                if (emp[i].age<30)
                {
                    System.out.println( emp[i].id + " " + emp[i].age);
                }
             }
        }
    }
}
