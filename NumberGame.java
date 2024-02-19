package main;
import java.util.*;

import java.util.Random;

public class NumberGame {
	
	public static void main(String[] args) {
		Random random=new Random();
		int randno=random.nextInt(100)+1;
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of chances you want to take:");
		int chance =in.nextInt();
		for(i=1;i<=chance;i++) {
			System.out.println("Enter your guess value between 1-100:");
			int guess=in.nextInt();
			int k=chance-i;
			if(randno==guess) {
				System.out.println("Brilliant! Your guess is right!");
				break;
			}
			else if(randno>guess ) {
				System.out.println("Oops! Your guess is lesser than the answer. Try Again.");
				System.out.println("Chances left:"+k);
				}
		    else if(randno<guess) {
		    	System.out.println("Oops! Your guess is greater than the answer");
		    	System.out.println("Chances left:"+k);
		    }

		if (i ==chance) {
            System.out.println(
                "You have exhausted "
                + chance + " trials.");
 
            System.out.println(
                "The number was " +randno);
        }
		}
		
		
		
}
}
