import java.util.Scanner;

public class recusrsionfirstind {static Scanner sc=new Scanner(System.in);

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
		if(arr[n]==item) {return n;}
		if(n==arr.length-1) {return -1;}
		b=index(arr,n+1,item);
		
		return b;
		
	}

	}


