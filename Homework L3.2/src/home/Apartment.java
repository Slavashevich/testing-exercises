package home;
import java.util.Scanner;
public class Apartment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apartmentNumber;
		System.out.println("Input apartment number");
		apartmentNumber=sc.nextInt();
		int floor;
		int variable;
		int entrance ;
		int allApart ;
		allApart = 9*4*5;
		
		if (apartmentNumber <=0 || apartmentNumber>allApart) {
			System.out.println("Input error");
		} else {
		entrance= (apartmentNumber-1)/4/9+1;
		System.out.println("Entrance "+ entrance);
		variable= (apartmentNumber-1) % 36;
		floor = variable / 4 + 1;
		System.out.println("Floor "+ floor);
		
	}

	}
}
/*if (apartmentNumber <=0 || apartmentNumber>allApart) {
System.out.println("Input error");
} else {
entrance= apartmentNumber/4/9+1;
System.out.println("Entrance "+ entrance);
variable= apartmentNumber % 36;
if (variable == 0) {
System.out.println("Floor "+ 9);
} else {
floor = variable / 4 + 1;
System.out.println("Floor "+ floor);
}
}*/
