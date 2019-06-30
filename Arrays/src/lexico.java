
public class lexico {

	public static void main(String[] args) {
		lexicog(0,1000);

	}public static void lexicog(int st,int en)
	{if(st>en) {return;}
		int j=0;int i=0;
		System.out.println(st);
		if(st==0) {j=i+1;}
		for(i=j;i<=9;i++)
		{
			lexicog(10*st+i,en);
			
			
		}
		
		
		
	}

}
