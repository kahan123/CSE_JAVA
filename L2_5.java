import java.util.Scanner;
public class L2_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		int a=s.nextInt();
		int l=a;
		a=s.nextInt();
		if(a>l)
			l=a;
		a=s.nextInt();
		if(a>l)
			l=a;
		System.out.println("Largest = "+l);
		

	}

}
