import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Day2P2
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
            //A and X are rock
            //B and Y are paper
            //C and Z are scissor
           if(tempMe=='X')
           {
              if(tempOpp=='A')
              {
                score+=3;
              }
              else if(tempOpp=='B')
              {
                score+=1;
              }
              else if(tempOpp=='C')
              {
                score+=2;
              }
           }
           if(tempMe=='Y')
           {
              score+=3;
              if(tempOpp=='A')
              {
                score+=1;
              }
              else if(tempOpp=='B')
              {
                score+=2;
              }
              else if(tempOpp=='C')
              {
                score+=3;
              }
           }
           if(tempMe=='Z')
           {
                score+=6;
              if(tempOpp=='A')
              {
                score+=2;
              }
              else if(tempOpp=='B')
              {
                score+=3;
              }
              else if(tempOpp=='C')
              {
                score+=1;
              }
           }
            


            
        }
        System.out.println(score);
    }
}