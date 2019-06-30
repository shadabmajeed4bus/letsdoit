
public class countpalindromicsubs {

	public static void main(String[] args) {
		System.out.println(palinsub("nitin"));
	}

	public static int palinsub(String str) {
		int count = 0;
//even substrings
		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++)

			{

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}

			}

		}
		// odd
		for (double axis = 0.5; axis < str.length(); axis++) {

			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++)

			{

				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}

			}

		}
		return count;

	}

}
