import java.util.Scanner;

public class Stringfre {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(ins(str));
		

	}public static char ins(String str)
	{char ans ='1'; int count=0;int ns=-1;
	for(int i=0;i<str.length();i++)
	{count=0; for(int j=0;j<str.length();j++) {if(str.charAt(j)==str.charAt(i)) {count++;}}
		
		if(count>ns) {ns=count;ans=str.charAt(i);}
	}
	return ans;
	
}

}
