
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Day3P2
{
    public static void main(String[] args) throws Exception
    {
    
        Scanner in = new Scanner(new File("Day3Input.txt"));
        //Scanner in = new Scanner(new File("test.txt"));
        ArrayList<String> inputs = new ArrayList<String>();
        while(in.hasNextLine())
        {
            inputs.add(in.nextLine());
        }
        //inputs.add("vJrwpWtwJgWrhcsFMMfFFhFp");
        int sum = 0;
        int counter=0;
        while(counter<inputs.size())
        {
            char ans = '`';
            String first = inputs.get(counter);
            counter++;
            String second = inputs.get(counter);
            counter++;
            String third = inputs.get(counter);
            counter++;
            char [] tempFir = first.toCharArray();
            ArrayList<Character> fir = new ArrayList<Character>();
            for(char c : tempFir)
            {
                fir.add(c);
            }
            char [] tempSec = second.toCharArray();
            ArrayList<Character> sec = new ArrayList<Character>();
            for(char c : tempSec)
            {
                sec.add(c);
            }
            char [] tempThir = third.toCharArray();
            ArrayList<Character> thir = new ArrayList<Character>();
            for(char c : tempThir)
            {
                thir.add(c);
            }
            for(char c : fir)
            {
                if(sec.contains(c) && thir.contains(c))
                {
                    ans=c;
                    break;
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
            System.out.println(fir);
            System.out.println(sec);
            System.out.println(thir);
        }
        
        
        System.out.println(sum + " " + counter + " " + inputs.size());

    }    
}
