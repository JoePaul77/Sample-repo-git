package ProblemSolving;

import java.util.*;

public class Main {
    
    public static int countValidWords(String s) {
        String[] words=s.split(" ");
        int count=0;
        
        for(String word : words) 
        {
        	 if(isValid(word)) 
        	 {
        		 count++;
        	 }
        }
        
        return count;
    }
    
    public static boolean isValid(String word) {
        if(word.length()<3) 
        {
        	return false;
        }
        
        String vowels="aeiouAEIOU";
        boolean hasvow=false;
        boolean hasconst=false;
        
        for(char c : word.toCharArray()) 
        {
        	  if(!Character.isLetterOrDigit(c)) 
        	  {
        		  return false;
        	  }
        	  if(Character.isLetter(c)) 
        	  {
        		  if(vowels.indexOf(c) != -1) 
        		  {
        			  hasvow=true;
        		  }
        		  else 
        		  {
        			  hasconst=true;
        		  }
        	  }
        }
        
        return hasvow && hasconst;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countValidWords(s));
    }
}