
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Day4P2
{
    public static void main(String[] args) throws Exception
    {
        //first number is larger and second number is smaller = encapsulated
        int total = 0;
        Scanner in = new Scanner(new File("Day4Input.txt"));
        //Scanner in = new Scanner(new File("test.txt"));
        ArrayList<String> inputs = new ArrayList<String>();
        while(in.hasNextLine())
        {
            inputs.add(in.nextLine());
        }
        for(String s : inputs)
        {
            int indexComma = s.indexOf(",");
            String firstHalf = s.substring(0,indexComma);
            String secondHalf = s.substring(indexComma+1);
            int indexDashOne = firstHalf.indexOf("-");
            int low1 = Integer.parseInt(firstHalf.substring(0,indexDashOne));
            int high1 = Integer.parseInt(firstHalf.substring(indexDashOne+1));
            int indexDashTwo = secondHalf.indexOf("-");
            int low2 = Integer.parseInt(secondHalf.substring(0,indexDashTwo));
            int high2 = Integer.parseInt(secondHalf.substring(indexDashTwo+1));
//hello
            if(high1>=low2 && high1<=high2)
            {
                total++;
            }
            else if(low1>=low2 && low1<=high2)
            {
                total++;
            }
            else if(high2>=low1 && high2<=high1)
            {
                total++;
            }
            else if(low2>=low1 && low2<=high1)
            {
                total++;
            }


        }
        System.out.println(total);
    }
}
