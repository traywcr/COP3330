import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber, firstDigit, secondDigit, thirdDigit, fourthDigit, encryptedNumber;
		int temp1, temp2;
		
		
		System.out.print("Enter a 4-digit integer: ");
		Scanner inputInteger = new Scanner(System.in);
		inputNumber = inputInteger.nextInt();
		
		
		firstDigit = ((inputNumber / 1000) + 7) % 10;
		secondDigit = ((inputNumber % 1000 / 100) + 7) % 10;
		thirdDigit = ((inputNumber % 100 / 10) + 7) % 10;
		fourthDigit = ((inputNumber % 10) + 7) % 10;
		
		/*
		 * Basic Checks to make sure the variables had the right value
			
			System.out.println("The first digit is: " + firstDigit);
			System.out.println("The second digit is: " + secondDigit);
			System.out.println("The third digit is: " + thirdDigit);
			System.out.println("The fourth digit is: " + fourthDigit);
			encryptedNumber = (firstDigit * 1000) + (secondDigit * 100) + (thirdDigit * 10) + fourthDigit;
			System.out.println("The encrypted number is: " + encryptedNumber);
		
		*/
		
		temp1 = thirdDigit;
		thirdDigit = firstDigit;
		firstDigit = temp1;
		
		temp2 = fourthDigit;
		fourthDigit = secondDigit;
		secondDigit = temp2;
		
		encryptedNumber = (firstDigit * 1000) + (secondDigit * 100) + (thirdDigit * 10) + fourthDigit;
		System.out.println("The newest encrypted integer is: " + encryptedNumber);
		
		
	}

}
