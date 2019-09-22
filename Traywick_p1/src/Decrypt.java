import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber, firstDigit, secondDigit, thirdDigit, fourthDigit, decryptedNumber;
		int temp1, temp2;
		
		
		System.out.print("Enter a 4-digit integer: ");
		Scanner inputInteger = new Scanner(System.in);
		inputNumber = inputInteger.nextInt();
		
		
		firstDigit = ((inputNumber / 1000) + 3) % 10;
		secondDigit = ((inputNumber % 1000 / 100) + 3) % 10;
		thirdDigit = ((inputNumber % 100 / 10) + 3) % 10;
		fourthDigit = ((inputNumber % 10) + 3) % 10;
		
		/*
		 * Making sure the values came out as expected
		System.out.println("The first digit is: " + firstDigit);
		System.out.println("The second digit is: " + secondDigit);
		System.out.println("The third digit is: " + thirdDigit);
		System.out.println("The fourth digit is: " + fourthDigit);
		*/
		
		temp1 = thirdDigit;
		thirdDigit = firstDigit;
		firstDigit = temp1;
		
		temp2 = fourthDigit;
		fourthDigit = secondDigit;
		secondDigit = temp2;
		
		
		decryptedNumber = (firstDigit * 1000) + (secondDigit * 100) + (thirdDigit * 10) + fourthDigit;
		System.out.println("The encrypted number is: " + decryptedNumber);

		
		
		

								
		/*						
		System.out.println("The first digit is: " + firstDigit);
		System.out.println("The first digit is: " + secondDigit);
		System.out.println("The first digit is: " + thirdDigit);
		System.out.println("The first digit is: " + fourthDigit + "\n");
		
		if(firstDigit < 0) {
			firstDigit *= -1;
		}
		if(secondDigit < 0) {
			secondDigit *= -1;
		}
		if(thirdDigit < 0) {
			thirdDigit *= -1;
		}
		if(fourthDigit < 0) {
			fourthDigit *= -1;
		}
		
		System.out.println("The first digit is: " + firstDigit);
		System.out.println("The first digit is: " + secondDigit);
		System.out.println("The first digit is: " + thirdDigit);
		System.out.println("The first digit is: " + fourthDigit);
		
		
		
		decryptedNumber = (firstDigit * 1000) + (secondDigit * 100) + (thirdDigit * 10) + fourthDigit;
		
		System.out.println("The encrypted number is: " + decryptedNumber);
	
		 */
	}

}
