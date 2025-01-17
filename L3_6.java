import java.util.Scanner;
public class L3_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=s.nextInt();
		int b=a;
		int rev=0;
		while (b!=0) {
			int d=b%10;
			rev=rev*10+d;
			b=b/10;
		}
		if(a==rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}

	}

}
