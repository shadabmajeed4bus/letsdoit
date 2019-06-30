
public class polynomialinncomplex {

	public static void main(String[] args) {
		System.out.println(power(3, 3));

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int z = power(x, n / 2);
		if (n % 2 == 0) {
			return z * z;
		} else {
			return z * z * x;
		}

	}

}
