import java.util.Scanner;
public class L3_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=s.nextInt();
		boolean b=false;
		for (int i=2;i<a;i++) {
			if(a%i==0) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}
	}

}
