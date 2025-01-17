import java.util.Scanner;
public class L3_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int l=(a>b) ? (a>c) ? a : c : (b>c) ? b : c;
		System.out.println("Largest = "+l);

	}

}
