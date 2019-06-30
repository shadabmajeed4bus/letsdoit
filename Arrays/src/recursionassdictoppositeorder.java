import java.util.Scanner;

public class recursionassdictoppositeorder {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	String str=sc.nextLine();
	dict(str,"",str);
		

	}public static void dict(String que,String ans,String str)
	{
		if(que.length()==0&&comp(ans,str)==1) {System.out.println(ans);}
		
		
		for(int i=0;i<que.length();i++)
		{
			char ch=que.charAt(i);
			String roq=que.substring(0,i)+que.substring(i+1);
			dict(roq,ans+ch,str);
			
			
			
		}
		
		
		
		
		
	}public static int comp(String one,String two)
	{
		int i=0;int j=0;
		while(i<one.length()||j<two.length())
		{
			if((one.charAt(i)-'0')==(two.charAt(j)-'0')) {i++;j++;}
			else if((one.charAt(i)-'0')<(two.charAt(j)-'0')) {return 1;}
			else if ((one.charAt(i)-'0')>(two.charAt(j)-'0')) {return -1;}
		}
		
		if(i==one.length()&&j==two.length()) {return -1;}
		else if(i==one.length()) {return 1;}
		else {return -1;}
		
	}
}
