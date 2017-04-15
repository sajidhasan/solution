package solution;
import java.util.Scanner;

public class StringReverse {

		public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        int l = str.length();
	        boolean pal = true;
	        for(int i=0; i<l/2; i++)
	        {
	        	if(str.charAt(i) != str.charAt(l-i-1))
	        	{
	        		pal = false;
	        		break;
	        	}
	        }
	        
	        if(pal)
	        	System.out.println("Yes");
	        else System.out.println("No");
	        sc.close();
		}
}
