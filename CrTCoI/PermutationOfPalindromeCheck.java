/**
 * Created by ANJALI on 01/30/17.
 */

import java.util.Hashtable;
import java.util.Scanner;

 class PermutationOfPalindromeCheck {
    String str="";
    void getAString(){
        Scanner s=new Scanner(System.in);
        String[] c=(s.nextLine()).split(" ");
        for(String i:c)
            str=str+i;
    }
    boolean isEven(int num)
    {
        if(num%2==0)
            return true;
        return false;
    }
    boolean isPermutationOfAPalindrome(String str)
    {
        Hashtable<Character,Integer> counter=new Hashtable<Character,Integer>();
        for(char c:str.toCharArray())
            if(counter.containsKey(c))
                counter.put(c,counter.get(c)+1);
            else
                counter.put(c, 1);

        if(isEven(str.length()))
        {
            for(int i: counter.values())
                if(!isEven(i))
                    return false;
        }
        else
        {   int odd=0;
            for(int i: counter.values())
                if(!isEven(i))
                {
                    odd++;
                    if(odd>1)
                        return false;
                }
        }
        return true;

    }
    public static void main(String args[])
    {
        PermutationOfPalindromeCheck pop=new PermutationOfPalindromeCheck();
        pop.getAString();
        System.out.println(pop.isPermutationOfAPalindrome(pop.str));
    }
}

