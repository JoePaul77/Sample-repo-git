package BasicProgram;
import java.util.*;
public class program_1 {


	
	    public static void main(String[] args) {
	        int arr[] = {1, 2, 2, 3, 1, 4};

	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        System.out.println(map);
	    }
	}

