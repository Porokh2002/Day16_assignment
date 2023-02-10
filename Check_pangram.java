package String_assignment;


public class Check_pangram {
    public static void main(String[] args) {
        String str1= "The quick brown fox jumps over lazy dog";
        str1 =str1.replace(" ","");
        str1=str1.toUpperCase();
        char ch[]=str1.toCharArray();
        int arr[]=new int[26];
        boolean check = false;
        for(int i= 0;i<ch.length;i++)
        {
            arr[ch[i]-65]++; 
        }
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                System.out.println("It's not  panagram ");
                check=true;   
            }
        }
        if(check==false){
        System.out.println("It's a panagram");
        }
     
    }
}
