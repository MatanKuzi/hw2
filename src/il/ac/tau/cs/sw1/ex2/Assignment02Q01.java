package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q01 {

	public static void main(String[] args) {
		char c;
		String str;
		for (int i=0; i<args.length; i++)
		{
			str = args[i];
			c = str.charAt(0);
			if(c%3==0 && c%2==0)
			System.out.println(c);
			
		}	
		
	}

}
