package solution;

import java.util.Scanner;

public class GradingStudents {

	static int solve(int grade){
		int rounded_grade = grade;
		if(rounded_grade <38)
			return rounded_grade;
		else{
			int diff = Math.abs(5 - (grade%5));
			if (diff < 3)
			{
				rounded_grade = grade + diff;
				return rounded_grade;
			}
			else
				return rounded_grade;
		}
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        in.close();
        for(int i=0; i<grades.length; i++)
        {
        	int result = solve(grades[i]);
            System.out.println(result);
        }
      
    }

}
