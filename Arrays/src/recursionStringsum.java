import java.util.Scanner;

public class recursionStringsum {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(sum(str,0,0));

	}public static int sum(String str,int i,int sum)
	{if(i==str.length()) {return sum;}
		int ans;
		char ch=str.charAt(i);
		int t=ch-'0';
		ans=sum(str,i+1,sum+t);
		return ans;
		
	}

}
