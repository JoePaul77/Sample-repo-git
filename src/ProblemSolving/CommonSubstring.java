package ProblemSolving;
import java.util.*;

public class CommonSubstring {

	public static void commonSubstring(String[] a, String[] b) {
	        for(int i=0;i<a.length;i++) 
	        {
	        	 HashSet<Character> set=new HashSet<>();
	        	 
	        	 for(char c : a[i].toCharArray()) 
	        	 {
	        		 set.add(c);
	        	 }
	        		 boolean found=false;   
	        		 
	        		 for(char d : b[i].toCharArray()) 
	        		 {
	        			 if(set.contains(d)) 
	        			 {
	        				 found = true;
	        			 }
	        		 }
	        	 
	        	 
	        System.out.println(found ? "YES" : "NO");
	        	 
	        }
	}
	    
	    public static void main(String[] args) {
	        String[] a = {"cat", "dog", "sun", "abcd"};
	        String[] b = {"hat", "fog", "run", "wxyz"};
	        commonSubstring(a, b);
	    }
	}

