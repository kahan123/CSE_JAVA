import java.util.Scanner;
public class L5_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows : ");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<n-i-1) {
					System.out.print(" ");
				}
				else { 
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=0;j<n;j++) {	
				if(j<n-i-1) {
					System.out.print(" ");
				}
				else { 
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		s.close();
	}

}
