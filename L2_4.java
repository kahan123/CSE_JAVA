import java.util.Scanner;
public class L2_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit");
		double tf=s.nextDouble();
		double tc;
		tc = (tf-32)*5/9;
		System.out.println(tc+" celcius");

	}

}
