package ol_22;

import java.util.Random;

public class Adder {
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int get_otp(int min,int max)
	{
		int otp=0;
		Random r=new Random();
		while (otp<min)
		{
			otp=r.nextInt(max);
		}
		return otp;
	}

}
