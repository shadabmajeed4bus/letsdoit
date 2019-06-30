
public class recurnth {

	public static void main(String[] args) {
	System.out.println(nth(4,0));

	}public static int nth(int n,int sum)
	{int p=0;
		if(n==0) {return sum;}
		return nth(n-1,sum+n);
		
		
	}
	

}
