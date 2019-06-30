import java.util.Scanner;

public class Cyclicsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int brr[]=new int[n];int sum=0;
		for(int i=0;i<arr.length;i++) {arr[i]=sc.nextInt();}
       int m=sc.nextInt();
       for(int j=1;j<=m;j++)
       {for(int k=0;k<arr.length;k++) {brr[k]=arr[k];}
    	   
    	   int k=sc.nextInt();
       for(int i=0;i<arr.length;i++)
       {int t=i-k;if(t<0) {t=i-k+arr.length;}
    	   arr[i]=arr[i]+brr[t];
    	   
    	   
    	   
       }
       }for(int i=0;i<arr.length;i++) {sum=sum+arr[i];}System.out.println(sum%((int)Math.pow(10,9)+7));
	}

}
