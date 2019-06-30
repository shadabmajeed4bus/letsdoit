import java.util.Scanner;

public class recassingmentkpc {static int count=0;static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine(); 
		kpc(str,"");
		System.out.println();
		System.out.print(count);

	}public static void kpc(String que,String ans)
	
	
	{if(que.length()==0) {System.out.print(ans+" ");count++;return;}
		
			char ch=que.charAt(0);
			String ss=getCode(ch);
			String roq=que.substring(1);
			for(int j=0;j<ss.length();j++) {kpc(roq,ans+ss.charAt(j));}
			
			
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jkl";
		else if (ch == '5')
			return "mno";
		else if (ch == '6')
			return "pqrs";
		else if (ch == '7')
			return "tuv";
		else if (ch == '8')
			return "wx";
		else if (ch == '9')
			return "yz";
		
		else
			return "";
	}


}
