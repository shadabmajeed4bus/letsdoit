import java.util.Scanner;

public class recstringtoint {static Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(sum(str,0,0));

	}public static int sum(String str,int i,int um)
	{if(i==str.length()) {return um;}
	int ans;
	char ch=str.charAt(i);
	int t=ch-'0';
	ans=sum(str,i+1,um+t*(int)Math.pow(10,str.length()-i-1));
	return ans;
	
}

}
