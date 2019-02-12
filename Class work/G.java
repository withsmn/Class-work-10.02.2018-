package New;

import java.util.Scanner;

public class G; {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		byte Score; 
		int number;
		
		for (int i = 1; i <=100; i++) {
			System.out.println("Enter your number");
			number = input.nextInt();
			System.out.println("Enter your score");
			Score = input.nextByte();
			 if(number>=92 && number<=100) {
				 System.out.println(" Your number is " + number + " And your grade is A+" );
			 } 
			 else if (number>=84 && number<=89) {
				 System.out.println(" Your number is " + number + " And your grade is A" );
			 }
             else if (number>=74 && number<=83) {
            	 System.out.println(" Your number is " + number + " And your grade is A-" );
			 }
             else if (number>=67 && number<=73) {
            	 System.out.println(" Your number is " + number + " And your grade is B+" );
			 }
             else if (number>=60 && number<=66) {
            	 System.out.println(" Your number is " + number + " And your grade is B" );
			 }
             else if (number>=55 && number<=65) {
            	 System.out.println(" Your number is " + number + " And your grade is C" );
			
			
			
		}
		

	}
	}

