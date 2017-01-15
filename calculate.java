import java.lang.*;

public class calculate{
	public static void main(String[] args){
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[2]);
		String znak = args[1];
		if(znak.equals("+"))
		{
			int sum = a + b;
			System.out.println(sum);
		}
		if(znak.equals("-"))
		{
			int minus = a - b;
			System.out.println(minus);
		}
		if(znak.equals("u")){
		
			int umn = a * b;
			System.out.println(umn);
		}
		if(znak.equals("/"))
		{
			int del = a / b;
			System.out.println(del);
		}
		if(znak.equals("s"))
		{
			double ste = Math.pow(a,b);
			System.out.println(ste);
		}
		
	}
}