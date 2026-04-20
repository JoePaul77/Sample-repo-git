package ProblemSolving;

import java.util.*;

public class FirstHighFreq {
    
    public static char maximumOccurringCharacter(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(char c : text.toCharArray()) 
        {
        	 map.put(c,map.getOrDefault(c, 0)+1);
        }
        
        int MaxFreq=0;
        char res=text.charAt(0);
        
        
        for(char c : text.toCharArray()) 
        {
        	  int freq=map.get(c);
        	  
        	  if(freq>MaxFreq) 
        	  {
        		  MaxFreq=freq;
        		  res=c;
        	  }
        }
         return res;
    }
    
    public static void main(String[] args) {
        System.out.println(maximumOccurringCharacter("abcABCabc")); // a
        System.out.println(maximumOccurringCharacter("aabbcc"));    // a
        System.out.println(maximumOccurringCharacter("zzza"));      // z
    }
}