package Test;

import java.util.Scanner;

public class letterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(letterGrade(scanner.nextInt()));
		}
	}
	public static char letterGrade(int score) { char grade;
	if (score <0 || score > 100) grade = 'X';
	else if (score>=90 && score <=100) grade = 'A';
	else if (score>=80 && score <90) grade = 'B';
	else if (score>=70 && score <80) grade = 'C';
	else if (score>=60 && score <70) grade = 'D';
	else
	grade ='F'; return grade;
	}

}
