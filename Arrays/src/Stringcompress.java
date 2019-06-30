import java.util.Scanner;

public class Stringcompress {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.nextLine();
		char []tochar=str.toCharArray();
		
		String tsr=new String(tochar);
		System.out.println(comps(tsr));

	}

	public static String comps(String str) {
		String ans = "";
		int count = 0;
		int n = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i)) {
					count++;
					n = j;
									}if (str.charAt(j) != str.charAt(i)) {break;}

			}
			if (count > 1) {
				ans = ans + str.charAt(i) + count;
				i = n;
			} else {
				ans = ans + str.charAt(i);
				i = n ;
			}

		}
		return ans;

	}	

}
