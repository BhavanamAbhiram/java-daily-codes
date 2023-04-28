import java.io.*;
import java.util.*;

class Main 
{

    public static void main(String[] args) 
    {
        Scanner abhi = new Scanner(System.in);
        String s= abhi.nextLine();
        char c= abhi.nextLine().charAt(0);
        long count = s.chars().filter(ch->ch==c).count();
        System.out.println(count);
  }
}
