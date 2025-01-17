import java.util.Scanner;
public class L2_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the operation character : \n1. + \n2. - \n3. * \n4. /");
		char c=s.next().charAt(0);
		System.out.println("Enter the two numbers : ");
		int a=s.nextInt();
		int b=s.nextInt();
		float ans;
		switch(c) {
		case '+' : System.out.println("Ans = "+(a+b));
					break;
		case '-' : System.out.println("Ans = "+(a-b));
					break;
		case '*' : System.out.println("Ans = "+(a*b));
					break;
		case '/' : System.out.println("Ans = "+ ((float)a/b));
					break;
		default: System.out.println("Invalid input character");
		
		}
		

	}

}
