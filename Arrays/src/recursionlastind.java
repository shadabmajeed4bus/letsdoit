import java.util.Scanner;

public class recursionlastind {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
int item=sc.nextInt();

System.out.println(index(arr,0,item));


	}public static int index(int arr[],int n,int item)
	{
		int b;
		
		if(n==arr.length) {return -1;}
		b=index(arr,n+1,item);
		if(arr[n]==item&&b==-1) {return n;}
		return b;
		
	}


}
