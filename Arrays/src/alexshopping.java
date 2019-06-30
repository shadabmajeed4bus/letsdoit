import java.util.*;
public class alexshopping {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int items=sc.nextInt();
		int price[]=new int[items];
		for(int i=0;i<price.length;i++)
		{price[i]=sc.nextInt();}
		int quer=sc.nextInt();
		for(int i=1;i<=quer;i++)
		{   int count=0;
			int amt=sc.nextInt();int k=sc.nextInt();
			for(int j=0;j<price.length;j++)
			{
				if(amt%price[j]==0) {count++;}
				if(count>k) {break;}
			}
			
			if(count>=k) {System.out.println("Yes");}else {System.out.println("No");}
		}
		
		
}
}
