package ProblemSolving;

public class ShiftbyK {
    
    public static String rotate(String s, int k) {
        StringBuilder sb=new StringBuilder();
        
        k=k%26;
        
        for(char c: s.toCharArray()) 
        {
        	 int pos=((c-'A')-k+26)%26;
        	 sb.append((char)(pos+'A'));
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(rotate("AZ", 1));     // ZY
        System.out.println(rotate("HELLO", 52)); // HELLO
        System.out.println(rotate("AFMK", 4));   // WCIG
    }
}
