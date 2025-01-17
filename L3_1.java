import java.util.Scanner;
public class L3_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks obtained in 5 subjects : ");
		int a=0;
		int sum=0;
		for(int i=1;i<=5;i++ ) {
			a=s.nextInt();
			sum=sum+a;
		}
		double p=(sum/5.0);
		if(p>=60) {
			System.out.println("First class");
		}
		else if(p>=50) {
			System.out.println("Second class");
		}
		else if(p>=40) {
			System.out.println("Third class");
		}
		else {
			System.out.println("Fail");
		}
		

	}

}
