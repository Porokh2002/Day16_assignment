package String_assignment;
import java.util.Arrays;

public class Remove_duplicates {
    public static void main(String[] args) {
      String str1="interview";
      char ch[]=str1.toCharArray();
      Arrays.sort(ch);
      char temp[]=new char[ch.length];
    int j=0;
      for(int i=0; i<ch.length-1;i++)
      {
        if(ch[i]!= ch[i+1])
        {
          temp[j]=ch[i];
          j++;
        }
       }
       temp[j]=ch[ch.length-1];
       for(int i=0;i<ch.length;i++)
       {
        System.out.print(temp[i]);
       }
       
      }     
    }
    

