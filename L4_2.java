import java.util.Scanner;
public class L4_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[4];
		System.out.println("Enter 4 numbers : ");
		double sum=0;
		for(int i=0;i<4;i++) {
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		sum=sum/4.0;
		System.out.println("Avg = "+sum);
	}

}
