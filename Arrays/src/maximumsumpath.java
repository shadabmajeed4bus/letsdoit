import java.util.*;
public class maximumsumpath {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int t=sc.nextInt();
		for(int p=1;p<=t;p++)
		{
			int fir=sc.nextInt();
			int sec=sc.nextInt();
			int arr[]=new int[fir];
			for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}
			
			int brr[]=new int[sec];
			for(int i=0;i<brr.length;i++) {brr[i]=sc.nextInt();}
			int sum1=0,sum2=0,i=0,j=0;int sum=0;
		
			while(i<arr.length&&j<brr.length)
			{
				
				if(arr[i]<brr[j]) {sum1=sum1+arr[i];i++;}
				else if(arr[i]>brr[j]) {sum2=sum2+brr[j];j++;}
				else {sum1=sum1+arr[i];
				sum2=sum2+brr[j];
					if(sum1>sum2) {sum=sum+sum1;}
					
					else {sum=sum+sum2;}i++;j++;
					sum1=0;sum2=0;
				}
				
			}if(i==arr.length&&j!=brr.length) {for(int k=i;k<brr.length;k++) {sum=sum+brr[k];}}
			if(j==brr.length&&i!=arr.length) {for(int k=i;k<arr.length;k++) {sum=sum+arr[k];}}
			System.out.println(sum);
			
			
			
			
		}

		
		}

}
