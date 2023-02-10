package String_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Check_anagram {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 1st String");
        String str1= scan.nextLine();
        System.out.println("Enter 2nd String");
        String str2 = scan.nextLine();
        str1=str1.replace(" ", "");
        str2 =str2.replace(" ", "");
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("It's an anagram");
        }
        else{
            System.out.println("It's not an anagram");
        }
    }







    //----------Steps----------//
    /*
     * Input two strings
     * Convert to lowercase
     * create two chac Array
     * Sorting both array Using Arrays.sort() method
     * Compare both arrays. Using Arrays.equals() method
     */
}
