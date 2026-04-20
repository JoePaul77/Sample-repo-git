package ProblemSolving;

import java.util.List;

public class AndMar {
	public String winner(List<Integer> andrea, 
	                         List<Integer> maria, String s) {
             long Andscore=0;
             long Marscore=0;
             
             int start=(s.equalsIgnoreCase("Even") ? 0 : 1 );
             
             for(int i=start;i<andrea.size();i+=2) 
             {
            	   int a=andrea.get(i);
            	   int m=maria.get(i);
            	   
            	   if(a>m) 
            	   {
            		   Andscore+=(a-m);
            	   }
            	   else if(m>a) 
            	   {
            		   Marscore+=(m-a);
            	   }
            	   
            	   
             }
             
             if(Andscore>Marscore) 
             {
            	 return "Andrea";
             }
             else if(Marscore>Andscore) 
             {
            	 return "Maria";
             }
             else 
             {
            	 return "Tie";
             }
	    }
	}
