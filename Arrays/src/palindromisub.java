
		import java.util.*;
		public class palindromisub {static Scanner sc=new Scanner(System.in);
		    public static void main(String args[]) {
		    	String str=sc.nextLine();
		    	System.out.println(substring(str));
		       
		    }public static int substring(String str) {int count=0;
				for (int i = 0; i < str.length(); i++) {
					for (int j = i; j < str.length(); j++) {
		if(isPalindrome(str.substring(i, j + 1))==true){count++;}
					}

				}return count;

			}

			public static boolean isPalindrome(String str) {
				int lo = 0;
				int hi = str.length() - 1;
				while (lo < hi) {
					if (str.charAt(lo) != str.charAt(hi)) {
						return false;
					} else if (str.charAt(lo) == str.charAt(hi)) {
						lo++;
						hi--;
					}

				}
				return true;

			}
		


	}


