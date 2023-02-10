package String_assignment;

import java.util.Arrays;

public class Print_Duplicates_characteres {
    public static void main(String[] args) {
        String str = "interview";
      char[] ch = str.toCharArray();
      Arrays.sort(ch);
      System.out.println("Duplicates characters are:");
      for (int i = 0; i < ch.length; i++) {
         for (int j = i + 1; j < ch.length; j++) {
            if (ch[i] == ch[j]) {
               System.out.print(ch[i] + " ");
            }
         }
      }
    }
}