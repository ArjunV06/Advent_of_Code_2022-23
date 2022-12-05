import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Day2P1
{
    public static void main(String [] args) throws Exception
    { 
        int score=0;
        Scanner in = new Scanner(new File("Day2Input.txt"));
        ArrayList<String> opp = new ArrayList<String>();
        ArrayList<String> me = new ArrayList<String>();
        while(in.hasNextLine())
        {
            opp.add(in.next());
            me.add(in.next());
            if(in.hasNextLine())
            {
                in.nextLine();
            }
            else
            {
                break;
            }
            
        }
        for(int i  = 0; i<opp.size(); i++)
        {
            String tempO = opp.get(i);
            String tempM = me.get(i);
            char tempOpp = tempO.charAt(0);
            char tempMe = tempM.charAt(0);

            if(tempMe=='X') //rock
            {
                score+=1;
                if(tempOpp=='C') //scissor
                {
                    score+=6;
                }
                else if(tempOpp=='A') //rock
                {
                    score+=3;
                }
            }
            else if(tempMe=='Y') //paper
            {
                score+=2;
                if(tempOpp=='A') //rock
                {
                    score+=6;
                }
                else if(tempOpp=='B') //paper
                {
                    score+=3;
                }
            }
            else //scissor
            {
                score+=3;
                if(tempOpp=='B') //paper
                {
                    score+=6;
                }
                else if(tempOpp=='C') //scissor
                {
                    score+=3;
                }
            }
            


            
        }
        System.out.println(score);
    }
}