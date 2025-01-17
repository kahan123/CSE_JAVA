import java.util.Scanner;
public class L5_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word : ");
		String a=s.next();
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a.charAt(j));
			}
			System.out.println();
		}

	}

}