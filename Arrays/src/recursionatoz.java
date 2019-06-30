import java.util.*;
public class recursionatoz {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		String str=sc.nextLine();
		System.out.println(rec(str));

	}public static ArrayList<String> rec(String que)
	{if(que.length()==0) {ArrayList<String> br=new ArrayList<>();br.add("");return br;}
	ArrayList<String> mr=new ArrayList<>();
		for(int i=0;i<que.length();i++)
		{
			String st=que.substring(0,i+1);
			String current=getstring(st);
			if(st.length()<=2&&(Integer.parseInt(st)<=26))
			{  String roq=que.substring(i+1);
			 ArrayList<String> gr= rec(roq);
			 
			 for(String val:gr) {mr.add(current+val);}
			
			}
			
			
		}
		
		
	
		return mr;
		
	}
	public static String getstring(String que)
	{if(que.equals("1")) {return "a";}
	if(que.equals("2")) {return "b";}
	if(que.equals("3")) {return "c";}
	if(que.equals("4")) {return "d";}
	if(que.equals("5")) {return "e";}
	if(que.equals("6")) {return "f";}
	if(que.equals("7")) {return "g";}
	if(que.equals("8")) {return "h";}
	if(que.equals("9")) {return "i";}
	if(que.equals("10")) {return "j";}
	if(que.equals("11")) {return "k";}
	if(que.equals("12")) {return "l";}
	if(que.equals("13")) {return "m";}
	if(que.equals("14")) {return "n";}
	if(que.equals("15")) {return "0";}
	if(que.equals("16")) {return "p";}
	if(que.equals("17")) {return "q";}
	if(que.equals("18")) {return "r";}
	if(que.equals("19")) {return "s";}
	if(que.equals("20")) {return "t";}
	if(que.equals("21")) {return "u";}
	if(que.equals("22")) {return "v";}
	if(que.equals("23")) {return "w";}
	if(que.equals("24")) {return "x";}
	if(que.equals("25")) {return "y";}
	if(que.equals("26")) {return "z";}
	else {return "-1";}  
	
	}

}
