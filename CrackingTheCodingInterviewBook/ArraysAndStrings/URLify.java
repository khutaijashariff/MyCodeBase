package CrackingTheCodingInterviewBook.ArraysAndStrings; /**
 * Created by ANJALI on 01/30/17.
 */
/* Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string.
 *(Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 */
import java.io.IOException;
import java.util.Scanner;
 class URLify {

    String getLine()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        System.out.println("Length -->" + str.length());
        return str.trim();
    }
    String urlify(String str)
    {
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==' ')
                str=str.replace(" " ,"%20");
        return str;
    }
    void printURL(String str)
    {
        System.out.println(str);
    }

    public static void main(String args[])throws IOException
    {
        URLify u=new URLify();
        String str;
        str=u.getLine();
        u.printURL(u.urlify(str));

    }

}
