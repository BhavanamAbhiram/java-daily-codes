import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);

        String CAns=input.nextLine().toUpperCase();

        int n=input.nextInt();
        input.nextLine(); 

        for (int i=0;i<n;i++) 
        {
            String Ans = input.nextLine().toUpperCase();
            if (Ans.length() != CAns.length()) 
            {
                System.out.println("Incorrect Input");
                return;
            }

            double marks = 0;
            for (int j = 0; j <Ans.length(); j++) 
            {
                char Answ = Ans.charAt(j);
                if (Answ == 'X') 
                {
                    continue; 
                }
                char CAnsw = CAns.charAt(j);
                if (Answ == CAnsw) 
                {
                    marks += 1;
                } 
                else 
                {
                    marks -= 0.25;
                }
            }
            System.out.print(marks + " ");
        }
    }
}
