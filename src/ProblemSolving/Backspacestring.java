package ProblemSolving;

import java.util.*;

public class Backspacestring {
	    public int backspaceCompare(String s1, String s2) {
	        return (process(s1).equals(process(s2)) ? 1 : 0);
	    }
	    public String process(String s) 
	    {
	    	 Stack<Character> st=new Stack<>();
	    	 
	    	 for(char c : s.toCharArray()) 
	    	 {
	    		 if(c=='#') 
	    		 {
	    			 if(!st.isEmpty()) {
	    			 st.pop();}
	    		 }
	    		 else 
	    		 {
	    			 st.push(c);
	    		 }
	    	 }
			 return s;
	    	 
	    	 
	    }
	    
	   
	}

