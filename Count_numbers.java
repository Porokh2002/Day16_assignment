package String_assignment;

import java.util.Scanner;

public class Count_numbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scan.nextLine();
        str=str.toLowerCase();
        int vowels=0,cons=0,specialChar=0;
        char temp;
        for(int i=0;i<str.length();i++)
        {
           temp=str.charAt(i);
           if(temp=='a'|| temp=='e'|| temp=='i'||temp=='o'||temp=='u')
           {
            vowels++;
            
           }
           else if(temp>='a'&&temp<='z'){
            cons++;
           }
           else{
            specialChar++;
           }
        
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonate = " + cons);
        System.out.println("Special Characters = " + specialChar);
       
    }
}
