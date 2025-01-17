import java.util.Scanner;
public class L4_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int l=s.nextInt();
		int arr[]=new int[l];
		System.out.println("Enter elements of array : ");
		for (int i=0;i<l;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Array : ");
		for (int i=0;i<l;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Array in reverse : ");
		for (int i=1;i<=l;i++) {
			System.out.println(arr[l-i]);
		}
		

	}

}
