package Test;

import junit.framework.*;

import org.junit.Test;

public class JUnitTest extends TestCase {
	
	public int Input;
	public char Result;
	
	public void test_1() {
		Input = 100 ; Result = 'A';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_2() {
		Input = 101 ; Result = 'X';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_3() {
		Input = 90 ; Result = 'A';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_4() {
		Input = 89 ; Result = 'B';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_5() {
		Input = 80 ; Result = 'B';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_6() {
		Input = 79 ; Result = 'C';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_7() {
		Input = 70 ; Result = 'C';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_8() {
		Input = 69 ; Result = 'D';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_9() {
		Input = 60 ; Result = 'D';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_10() {
		Input = 59 ; Result = 'F';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_11() {
		Input = 0 ; Result = 'F';
		assertEquals(Result, letterGrade(Input));
	}
	public void test_12() {
		Input = -1 ; Result = 'X';
		assertEquals(Result, letterGrade(Input));
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