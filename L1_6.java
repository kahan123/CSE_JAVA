import java.util.Scanner;
public class L1_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a letter : ");
		char c=s.next().charAt(0);
		if(c=='a' || c=='A'|| c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U') {
			System.out.println("Entered letter is a vovel");
		}
		else {
			System.out.println("Entered letter is a consonent");
		}

	}

}
