package triangle;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		int c;
		System.out.println("input side a: ");
		   a = sc.nextInt();
		System.out.println("input side b: ");
		   b = sc.nextInt();
		System.out.println("input side c: ");
		   c = sc.nextInt();
		if (a+b>c && a+c>b && b+c>a){
			System.out.println("A traingle with given sides exists");
		} else {
			System.out.println("The traingle doesn't exist");
		}
	}
}
