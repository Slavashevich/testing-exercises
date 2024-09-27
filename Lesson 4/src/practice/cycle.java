package practice;
import java.util.Scanner;
public class cycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int w;
//		System.out.println("Input w: ");
//		w = sc.nextInt(); 
		int h;
		System.out.println("input h: ");
		h = sc.nextInt();
		for (int i= 1; i<=h; i++){
			for (int j = 1; j<=2*h-1; j++){
				if (j<=h-i || j>=h+i ) {
			System.out.print(" ");
				}else {
					System.out.print("*");
				}
		}
		System.out.println();
//		int start;
//		int end;
//		int sum=0;
//		System.out.println("Input start");
//		start = sc.nextInt();
//		System.out.println("Input end");
//		end = sc.nextInt();
//		if(start<end) {
//			for(int i=start;i <= end; i++) {
//				sum = sum + i;
//			}
//			} else {
//			for(int i =end; i <= start; i++) {
//				sum = sum + i;
//			}
//		}
//		System.out.println("Sum "+ sum);
	}
		}
}

