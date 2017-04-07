package CrackingTheCodingInterviewBook.ArraysAndStrings; /**
 * Created by ANJALI on 01/30/17.
 */

     /*There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away
 * EXAMPLE pale, ple -> true pales, pale -> true pale, bale -> true pale, bake -> false
 */
import java.io.IOException;
import java.util.Scanner;


    class OneEditAway {
        String str[]=new String[2];
        boolean stringsEditComparison()
        {

            Scanner s=new Scanner(System.in);
            System.out.println("enter two strings ");
            str[0]=s.next();
            str[1]=s.next();

            //equality check
            if(str[0].equalsIgnoreCase(str[1]))
                return true;

            if(str[0].length()==str[1].length())
                return isReplaced(str);

            if(Math.abs(str[0].length()-str[1].length())==1)
            {
                if(str[1].length()==str[0].length()+1)
                {
                    String temp;
                    temp=str[0];
                    str[0]=str[1];
                    str[1]=temp;
                    System.out.println(str[0] + " "+str[1]);
                }
                return (isInserted(str));
            }
            else
                return false;
        }

        boolean isReplaced(String[] str)
        {
            int edit=0;
            int i,j;
            for( i=0,j=0;i<str[0].length();i++,j++)
            {
                if(str[0].charAt(i)!=str[1].charAt(j))
                    edit++;
                if(edit>1)
                    return false;
            }
            return true;
        }

         public boolean isInserted(String[] str) {
              String s1 = str[1];
              String s2 = str[0];
        int i1 = 0;
        int i2 = 0;
        while(i1<s1.length() && i2<s2.length()) {
            if(s1.charAt(i1) != s2.charAt(i2)) {
                if(i1!=i2) { //maintain the same position on each string
                    return false;
                }
                i2++;
            }else {
                i1++;
                i2++;
            }
        }
        return true;
    }

        public static void main(String args[])throws IOException
        {
            OneEditAway oe=new OneEditAway();
            System.out.println(oe.stringsEditComparison());
        }
}
