package String_assignment;

public class Check_palindrome {
    public static void main(String[] args) {
        String str="madam";
        String temp="";
        for(int i=str.length()-1;i>=0;i--)
        {
            temp=temp+str.charAt(i);
        }
        if(str.equals(temp))
        {
            System.out.println("It's a palidrome ");

        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
}
