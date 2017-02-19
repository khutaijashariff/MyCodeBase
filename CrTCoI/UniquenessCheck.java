/**
 * Created by ANJALI on 01/30/17.
 */

/*Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures
 */
import java.util.Scanner;

class UniquenessCheck {
    String isUnique(String str)
    {
        int strt=0;
        while(strt<str.length())
        {
            for(int i=strt+1;i<str.length();i++)
            {
                if(str.charAt(i)==str.charAt(strt))
                {
                    return "no";
                }
            }
            strt++;
        }
        return "yes";
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        UniquenessCheck iu=new UniquenessCheck();
        System.out.println("Enter a string");
        String str=new String(s.next());
        System.out.println(iu.isUnique(str));

    }

}
