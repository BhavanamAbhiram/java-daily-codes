import java.util.Scanner;

public class Main
{
    private String name;

    public Student(String name) 
    {
        if (name.matches("[a-zA-Z]+")) 
        {
            this.name = name;
        } 
        else 
        {
            this.name = "Unknown";
        }
    }

    public String getName() 
    {
        return name;
    }

    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);

        String nameInput = input.nextLine().trim();
        
        Student s1 = new Student(nameInput);
        System.out.println(s1.getName());

        String otherInput = input.nextLine().trim();
        
        Student s2 = new Student(otherInput);
        System.out.println(s2.getName());

    }
}
