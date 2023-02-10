package String_assignment;

import java.util.Scanner;

public class print_maxChar {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the string to find the maximum occurring Character");     
    String str =scan.nextLine();
    str=str.replace(" ", "");
    int arr[]=new int[127];
    for(int i=0;i<str.length();i++)
    {
        arr[str.charAt(i)]=arr[str.charAt(i)]+1;
    }
    int checkMax=1;
    char temp=' ';
    for(int i=0;i<str.length();i++)
    {
        if(checkMax<arr[str.charAt(i)])
        {
            checkMax=str.charAt(i);
            temp=str.charAt(i);
        }
    }
    System.out.println(temp);

    }
   
}
