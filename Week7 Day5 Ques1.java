import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
      

        int[] freq = new int[128];

        for (int i = 0; i<str.length();i++) 
        {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) 
            {
                freq[ch]++;
            } 
            else 
            {
                System.out.println("Error");
                return;
            }
        }
        int maxFreq = 0;
        char maxChar = ' ';
        for (int i = 0; i < freq.length; i++) 
        {
            if (freq[i] > maxFreq) 
            {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }
        System.out.println("Maximum occurring character is: " + maxChar);
    }
}
