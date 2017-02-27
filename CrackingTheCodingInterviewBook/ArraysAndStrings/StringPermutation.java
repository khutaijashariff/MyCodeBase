package CrackingTheCodingInterviewBook.ArraysAndStrings; /**
 * Created by ANJALI on 01/30/17.
 */
import java.util.Hashtable;
import java.util.Scanner;

class StringPermutation {
    String str1,str2;
    void get2Strings()
    {
        Scanner s=new Scanner(System.in);
        str1 = s.next();
        str2=s.next();
    }
    boolean isSameLength(String str1, String str2)
    {
        if(str1.length()==str2.length())
            return true;
        return false;
    }
    boolean isPermutation(String str1,String str2)
    {

        if(!isSameLength(str1,str2))
            return false;
	 /*int sum1=0, sum2=0;
		for(char i:str1.toCharArray())
			sum1=sum1+i;
		for(char j:str2.toCharArray())
			sum2=sum2+j;
	}
	if(sum1==sum2)
		return true;
	return false;  proven wrong for strings AYX and BYW*/
        String joined=str1+str2;
        Hashtable<Character,Integer> counter=new Hashtable<Character,Integer>();
        for(char c:joined.toCharArray())
        {
            if(counter.containsKey(c))
                counter.put(c,counter.get(c)+1);
            else
                counter.put(c, 1);
        }
        for(int i: counter.values())
            if(i%2!=0)
                return false;
        return true;
    }

    public static void main(String args[])
    {
        StringPermutation sp=new StringPermutation();
        sp.get2Strings();
        sp.isSameLength(sp.str1,sp.str2);
        System.out.println(sp.isPermutation(sp.str1, sp.str2));

    }
}

