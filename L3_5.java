import java.util.Scanner;
public class L3_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year : ");
		int a=s.nextInt();
		if ( (a%4==0 && a%100!=0) || (a%400==0) ) {
			System.out.println("year is leap year");
		}
		else {
			System.out.println("year is not leap year");
		}

	}

}
