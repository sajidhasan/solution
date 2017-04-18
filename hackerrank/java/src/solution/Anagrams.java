package solution;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) 
	{
	        if(a.length() == b.length())
	        {    
	            char[] A = new char[a.length()];
	            char[] B = new char[b.length()];
	            
	            for(int i=0; i<a.length(); i++){
	                A[i] = a.toLowerCase().charAt(i);
	            }
	            for(int j=0; j< b.length(); j++){
	                B[j] = b.toLowerCase().charAt(j);
	            }
	        
	            Arrays.sort(A);
	            Arrays.sort(B);
	            
	            if(Arrays.equals(A,B)){
	              return true;
	            }
	            else{
	                return false;
	            }
	            
	        }
	        else
	            return false;
	    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}
	
}
