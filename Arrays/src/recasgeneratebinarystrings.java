import java.util.Scanner;

public class recasgeneratebinarystrings {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n=sc.nextInt();
		for(int p=1;p<=n;p++)
		{String str=sc.next();
  generate(str,"");}
	}public static void generate(String que,String ans)
	{if(que.length()==0) {System.out.print(ans+" ");return;}
		char ch=que.charAt(0);
		String roq=que.substring(1);
		if(ch=='1'||ch=='0') {generate(roq,ans+ch);}
		if(ch=='?') {
			
			generate(roq,ans+0);
			generate(roq,ans+1);
			
		}
		
		
		
	}

}
