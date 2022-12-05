
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Day3P1 
{
    public static void main(String[] args) throws Exception
    {
    
        Scanner in = new Scanner(new File("Day3Input.txt"));
        ArrayList<String> inputs = new ArrayList<String>();
        while(in.hasNextLine())
        {
            inputs.add(in.nextLine());
        }
        //inputs.add("vJrwpWtwJgWrhcsFMMfFFhFp");
        int sum = 0;
        for(int i = 0; i<inputs.size(); i++)
        {
            char ans = '`';
            String temp = inputs.get(i);
            String first = temp.substring(0,temp.length()/2);
            String second = temp.substring(temp.length()/2);
            //System.out.println(first + " " + second);

            char [] tempFir = first.toCharArray();
            char [] tempSec = second.toCharArray();
            ArrayList<Character> fir = new ArrayList<Character>();
            ArrayList<Character> sec = new ArrayList<Character>();
            for(char c : tempFir)
            {
                fir.add(c);
            }
            for(char c : tempSec)
            {
                sec.add(c);
            }
            for(char c : fir)
            {
                if(sec.contains(c))
                {
                    ans = c;
                }
            }
            int ansVal = ans;
            if(ansVal>=97)
            {
                ansVal-=96;
            }
            else
            {
                ansVal-=38;
            }
            sum+=ansVal;
        }
        System.out.println(sum);

    }    
}
