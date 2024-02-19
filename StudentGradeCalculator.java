package main;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float total,average;
		String grade;
		System.out.println("Enter marks out of 100 in English:");
		int e=in.nextInt();
		System.out.println("Enter marks out of 100 in Hindi:");
		int h=in.nextInt();
		System.out.println("Enter marks out of 100 in Maths:");
		int m=in.nextInt();
		System.out.println("Enter marks out of 100 in Science:");
		int s=in.nextInt();
		System.out.println("Enter marks out of 100 in Social:");
		int ss=in.nextInt();
		total=e+h+m+s+ss;
		average=total/5;
		System.out.println("Your Total is:"+total);
		System.out.println("Your Average is:"+average);
		if(average>=90) {
			System.out.println("Your grade is:O");
		}
		else if(average>=80&& average<90) {
			System.out.println("Your grade is:A+");
		}
		else if(average>=70 && average<80) {
			System.out.println("Your grade is:A");
		}
		else if(average>=60 && average<70) {
			System.out.println("Your grade is:B+");
		}
		else if(average>=50 && average<60) {
			System.out.println("Your grade is:B");
		}
		else {
		    System.out.println("FAIL");}

}
}
