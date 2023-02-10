package String_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Check_unique_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                System.out.println("No unique characters here");
                break;
            }
            else{
                System.out.println("All are unique");
                break;
            }
        }
      

    }
}
