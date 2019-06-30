
public class ppolynomial {

	public static void main(String[] args) {
		System.out.println(poly(7,2));

	}

	public static int poly(int n, int x)

	{
		int sum = 0;
		int multip = x;
		for (int k = n; k >= 1; k--) {

			sum = sum + k * multip;

			multip = multip * x;

		}

		return sum;

	}

}
