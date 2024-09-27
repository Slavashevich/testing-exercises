package petrol;

public class Budget {

	public static void main(String[] args) {
		double petrolCost = 1.2;
		int distance = 120;
		double budget;
		budget = distance * petrolCost * (1 * 8) / 100;
		System.out.println(budget + " $");
	}
}
