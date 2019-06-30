import java.util.Scanner;

public class recursionreversearray {static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int i;
		int arr[] = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr,0,arr.length-1);
		for(int val:arr) {System.out.println(val);}
		
		

	}public static void reverse(int arr[],int i,int j)
	{if(i>j) {return;}
		int temp=0;
		temp=arr[i];arr[i]=arr[j];arr[j]=temp;
		reverse(arr,i+1,j-1);

		
	}

}
