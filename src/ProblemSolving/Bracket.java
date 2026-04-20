package ProblemSolving;

import java.util.*;

public class Bracket {
    
    public static List<Integer> convertible(String[] dataset) {
        List<Integer> res = new ArrayList<>();
        
        for(String s : dataset) 
        {
        	if(s.length()%2 !=0) 
        	{
        		res.add(0);
        		continue;
        	}
        	
        	int open=0;
        	int close=0;
        	
        	for(char c: s.toCharArray()) 
        	{
        		if(c=='(') 
        		{
        			open++;
        		}
        		else 
        		{
        			close++;
        		}
        	   
        	}
        	res.add(open == close ? 1 : 0);
        	
        }
     	return res;
    }
    
    public static void main(String[] args) {
        System.out.println(convertible(new String[]{")(", "(()", "()"})); // [1, 0, 1]
        System.out.println(convertible(new String[]{"(())", "(((("}));    // [1, 0]
    }
}