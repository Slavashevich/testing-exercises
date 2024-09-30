package number;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number;
		System.out.println("input number from 4 to 16: ");
		number = sc.nextInt();
		long sum=1;
		if (number>4 && number < 16) {
			for (int i= number ;i >= 1 ; i-- ) {
				sum = sum*i;
			} 
			System.out.println("Sum "+ sum);
			} else {
			System.out.println("The entered number doesn't meet the condition");
		}
	}
}
