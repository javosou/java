package ist311.assignment.labone;

import java.util.Scanner;

public abstract class LetterGradesPart1 {
	public static Scanner scanner = new Scanner(System. in);
	public static void letterGradesPart1() {
		int choice = 0;
		String operation = null;
		double grade = -1;
		while(choice != -1) {
		System.out.println("============================ LetterGradesPart1 ==========================");
		System.out.println(" Grade:     A+     |A     |A-    |B+    |B     |B-    |C+    |C     |C-    |D+    |D     |D-    |F ");
		System.out.println(" its value: 97–100%|93–96%|90–92%|87–89%|83–86%|80–82%|77–79%|73–76%|70–72%|67–69%|63–66%|60–62%|0–59%");
		System.out.println("Choose your grade value (to quit type -1) ==============================");
		System.out.print("your choice:");
        operation = scanner. nextLine();
        grade = Double.parseDouble((operation));
        if(operation.equals("-1")) {
        	choice = -1;
        	continue;}
        
		else if(!isGradeValid(grade)) {
			System.out.println("Alert:********the grade value should compromised between 0 and 100***********");
			continue;}
		else {
				displayGrade(grade,1);
		}
		}
    }
	public static boolean isGradeValid(double grade) {
		if(grade >= 0 && grade <=100)
			return true;
			return false;
	}
	public static String gradeValue(double grade) {
		if(grade >=97 && grade <= 100) {
			return "A+";
		}
		else if(grade >=93 && grade <= 96) {
			return "A";
		}
		else if(grade >=90 && grade <= 92) {
			return "A-";
		}
		else if(grade >=87 && grade <= 89) {
			return "B+";
		}
		else if(grade >=83 && grade <= 86) {
			return "B";
		}
		else if(grade >=80 && grade <= 82) {
			return "B-";
		}
		else if(grade >=77 && grade <= 79) {
			return "C+";
		}
		else if(grade >=73 && grade <= 76) {
			return "C";
		}
		else if(grade >=70 && grade <= 72) {
			return "C-";
		}
		else if(grade >=67 && grade <= 69) {
			return "D+";
		}
		else if(grade >=63 && grade <= 66) {
			return "D";
		}
		else if(grade >=60 && grade <= 62) {
			return "D-";
		}
		else {
			return "F";
		}
		
	}
	public static void displayGrade(double grade,int test) {
		if (test == 1)
		System.out.println("Your Grade is : "+gradeValue(grade) );
		else if (test ==2 )
		System.out.println("Your Grade is : "+LetterGradesPart2.gradeValue(grade));
		System.out.println("Type any key to continue.....");
		scanner. nextLine();
	}
}
