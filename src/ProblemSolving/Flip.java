package ProblemSolving;

public class Flip {
	public static int theFinalProblem(String target) 
	{
		
		int flips=0;
		
		
		for(int i=0;i<target.length();i++) 
		{
			char CurrentBit;
			
			if(flips%2==0) 
			{
				CurrentBit='0';
			}
			else 
			{
				CurrentBit='1';
			}
			
			if(CurrentBit != target.charAt(i)) 
			{
				flips++;
			}
		}
		
		return flips;
	}
}
