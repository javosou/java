package ist311.assignment.labone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String operation = null;
		int choice = 0;
		while(choice != -1) {
			System.out.println("Choose an operation:");
			System.out.println("1  : LetterGrades Part 1");
			System.out.println("2  : LetterGrades Part 2");
			System.out.println("3  : LetterGrades Part 3");
			System.out.println("-1 : to quit the program");
			System.out.print("Operation:");
			Scanner scanner = new Scanner(System. in);
	        operation = scanner. nextLine();
	        if(operation.equals("-1")) {
	        	choice = -1;
	        	continue;
	        }
	        else if (operation.equals("1")) {
	        	LetterGradesPart1.letterGradesPart1();
	        }
	        else if (operation.equals("2")) {
	        	LetterGradesPart2.letterGradesPart2();;
	        }
		}
	}

}
