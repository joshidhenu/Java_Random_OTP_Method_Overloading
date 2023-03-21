package ol_22;

//import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		int sum =Adder.add(12,24);
		//System.out.println("enter two digits : ");
		//Scanner sc=new Scanner(System.in);
		//sum=sc.nextInt();
		//Adder add=new Adder();
		System.out.println(sum);		
	   //sc.close();
	int otp = Adder.get_otp(10000, 99999);
	System.out.println(otp);
	}
}
