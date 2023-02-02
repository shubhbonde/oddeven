package oddEvenTestProject;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("test 56");
		System.out.println("Enter the number ");
		int number = scan.nextInt();
		System.out.println(checkTheNumberIsEven(number));
	}

	public static boolean checkTheNumberIsEven(int number) {
		return number%2==0;
	}

}
