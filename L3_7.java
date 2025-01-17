import java.util.Scanner;
public class L3_7 {

	boolean prime (int a) {
		boolean ans=true;
		for (int i=2;i<a;i++) {
			if(a%i==0) {
				ans=false;
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		L3_7 o=new L3_7();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter lower limit : ");
		int a=s.nextInt();
		System.out.println("Enter upper limit : ");
		int b=s.nextInt();
		for (int i=a;i<=b;i++) {
			boolean ans=o.prime(i);
			if(ans) {
				System.out.println(i);
			}
		}

	}

}