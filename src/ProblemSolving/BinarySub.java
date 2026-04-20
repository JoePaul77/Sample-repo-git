package ProblemSolving;

public class BinarySub {
	
    public int countBinarySubstrings(String s) {
        int ans=0;
        int oldgrpsize=0;
        int currentgrpsize=1;
        
        for(int i=0;i<s.length();i++) 
        {
        	 if(s.charAt(i)==s.charAt(i-1))
        	{
        		 currentgrpsize++;
        	}
        	 else 
        	 {
        		 ans=Math.min(oldgrpsize, currentgrpsize);
        		 oldgrpsize=currentgrpsize;
        		 currentgrpsize=1;
        	 }
        }
         return ans+(Math.min(oldgrpsize, currentgrpsize));
    }
}