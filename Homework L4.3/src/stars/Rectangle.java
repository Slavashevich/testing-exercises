package stars;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int h;
		int w;
		System.out.println("input hight :");
		h = sc.nextInt();
		System.out.println("input widht :");
		w = sc.nextInt();
		for (int i=1; i<=h; i++) {
			for (int j=1; j <=w; j++) {
				if (i==1 || i==h || j == 1 || j == w) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
			System.out.println();
	}
	}
}
