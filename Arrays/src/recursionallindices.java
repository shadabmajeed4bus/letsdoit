import java.util.Scanner;

public class recursionallindices {static Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		

	int n = sc.nextInt();
	int i;
	int arr[] = new int[n];
	for (i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
int item=sc.nextInt();
int brr[]=index( arr,0,item,0);
for(int val:brr) {System.out.println(val);}


}public static int[] index(int arr[],int n,int item,int count)
{
	int b[];
	if(n==arr.length) {int brr[]=new int[count];return brr;}
	if(arr[n]==item)
	{b=index(arr,n+1,item,count+1);}
	else
	{b=index(arr,n+1,item,count);}
	if(arr[n]==item) {b[count]=n;}
	return b;
}



}
