package ist311.assignment.labone;

import java.util.ArrayList;

public class LetterGradesPart2 {
	public static final String grades[] = new String[] {"A+","A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
	public static final double gradesValue[][] = new double[][] {
		{97,100},
		{93,96},
		{90,92},
		{87,89},
		{83,86},
		{80,82},
		{77,79},
		{73,76},
		{70,72},
		{67,69},
		{63,66},
		{60,62},
		{0,59}
	};
	public static void letterGradesPart2() {
		int choice = 0;
		String operation = null;
		double grade = -1;
		while(choice != -1) {
		System.out.println("============================ LetterGradesPart2 ==========================");
		System.out.println(" Grade:     A+     |A     |A-    |B+    |B     |B-    |C+    |C     |C-    |D+    |D     |D-    |F ");
		System.out.println(" its value: 97–100%|93–96%|90–92%|87–89%|83–86%|80–82%|77–79%|73–76%|70–72%|67–69%|63–66%|60–62%|0–59%");
		System.out.println("Choose your grade value (to quit type -1) ==============================");
		System.out.print("your choice:");
        operation = LetterGradesPart1.scanner. nextLine();
        grade = Double.parseDouble((operation));
        if(operation.equals("-1")) {
        	choice = -1;
        	continue;}
        
		else if(!LetterGradesPart1.isGradeValid(grade)) {
			System.out.println("Alert:********the grade value should compromised between 0 and 100***********");
			continue;}
		else {
			LetterGradesPart1.displayGrade(grade,2);
		}
		}
	}
	public static String gradeValue(double grade) {
		for (int i=0;i<grades.length;i++) {
			if(grade >= gradesValue[i][0] && grade <= gradesValue[i][1]) {
				return grades[i];
			}
		}
		return "not found - this return is never recheable";
	}
}
