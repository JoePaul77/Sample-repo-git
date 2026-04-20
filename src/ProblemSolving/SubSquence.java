package ProblemSolving;

import java.util.*;

public class SubSquence {
    
    public static List<String> missingWords(String s, String t) {
        String[] sarr=s.split(" ");
        String[] tarr=t.split(" ");
        
        List<String> ls=new ArrayList<>();
        int j=0;
        
        for(int i=0;i<sarr.length;i++) 
        {
        	if(j<tarr.length && sarr[i].equals(tarr[j]))
        	{
        		j++;
        	}
        	else {
        		
        		ls.add(sarr[i]);
        	}
        }
        
        return ls;
        
        
        
    }
    
    public static void main(String[] args) {
        System.out.println(missingWords(
            "I am using HackerRank to improve programming",
            "am HackerRank to improve"
        )); // [I, using, programming]
        
        System.out.println(missingWords(
            "I like cheese",
            "like"
        )); // [I, cheese]
    }
}