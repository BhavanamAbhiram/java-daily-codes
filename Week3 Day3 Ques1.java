import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sai = new Scanner(System.in);
        int x=sai.nextInt();
        
        if(x<100||x>20000||x%100!=0)
        {
            System.out.println("Invalid Input");
            return;
        }
        int[] notes={2000,500,200,100};
        int[] notesCount=new int[4];
        for (int i = 0; i < 4; i++) 
        {
            if(x>=notes[i])
            {
                notesCount[i]=x/notes[i];
                x=x%notes[i];
            }
        }
        for (int i = 0; i < 4; i++) {
      if (notesCount[i] != 0) {
        System.out.println(notesCount[4-i] + " " + notes[4-i] + " Notes");
      }
    }
  }
}
