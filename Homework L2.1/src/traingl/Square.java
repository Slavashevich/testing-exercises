package traingl;

public class Square {

	public static void main(String[] args) {
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		double p;
		p = (sideA+sideB+sideC)/2;
		double s;
		s = Math.sqrt(p * (p - sideA)*(p - sideB)*(p - sideC));
		System.out.println(s);
	}

}
