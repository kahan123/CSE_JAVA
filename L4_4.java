import java.util.Scanner;
public class L4_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String a=s.nextLine();
		System.out.println("Length = "+a.length());
		for(int i=a.length()/2;i<a.length();i++) {
			System.out.print(a.charAt(i));
		}

	}

}
