package arifmetic;
import java.util.Scanner;

public class Algebra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input coffe cost (EUR) and press Enter: ");
		int coffeCoct = sc.nextInt();
		
		System.out.println("Input cups and press Enter: ");
		int cups = sc.nextInt();
		
		int totalSum;
		totalSum = coffeCoct * cups ;
		System.out.println(totalSum + " EUR");
	}

}
