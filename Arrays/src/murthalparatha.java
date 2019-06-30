import java.util.Scanner;

public class murthalparatha {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int paratha=sc.nextInt();
		int cooks=sc.nextInt();
		int ranks[]=new int[cooks]; 
		for(int i=0;i<cooks;i++)
		{ranks[i]=sc.nextInt();}
int lo=0,hi=0;int r=1;int ans=-1;
for(int i=1;i<=paratha;i++) {hi=hi+r*ranks[0];r++;}
	while(lo<=hi)
	{ int mid=(lo+hi)/2;
		
		if(ispossible(ranks,mid,paratha)==true) {ans=mid;hi=mid-1;}
		else {lo=mid+1;}
		
		
		
		
	}
	System.out.println(ans);

	}
	

	public static boolean ispossible(int arr[],int time,int cou)
	{int count=0;
		for(int i=0;i<arr.length;i++)
		{
			
			int tim=0;
		   int initial=0;
			for(int r=1;r<=time;r++)
			{
				initial=initial+r*arr[i];if(initial<=time) {count++;}
				
				if(initial>time) {break;}
							}
			
			
			
			
		}
		if(count>=cou) {return true;}
		else {return false;}
		
		
		
		
		
	}
	
	
	
	

}
