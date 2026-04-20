package ProblemSolving;

import java.util.*;

public class MaxConsecutive {
    
    public static int maxConsecutive(int[] arr) {
        Arrays.sort(arr);
        int Maxcount=1;
        int count=1;
        
        for(int i=1;i<arr.length;i++) 
        {
        	  if(arr[i]-arr[i-1]<=1) 
        	  {
        		  count++;
        	  }
        	  else
        	  {
        		Maxcount=Math.max(Maxcount, count) ;
        		count=1;
        	  }
        }
        
        return Math.max(Maxcount, count);
    }
    
    public static void main(String[] args) {
        System.out.println(maxConsecutive(new int[]{4,13,14,2,3})); // 3
        System.out.println(maxConsecutive(new int[]{1,1,1,2,3}));   // 5
        System.out.println(maxConsecutive(new int[]{1,5,10}));      // 1
    }
}