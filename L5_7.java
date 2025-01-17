import java.util.Scanner;
public class L5_7 {
	int index (int nums[] , int t) {
		int index =-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==t) {
				index=i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		L5_7 o=new L5_7();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		int n=s.nextInt();
		int nums[]=new int[n];
		System.out.println("Enter the elements of aray : ");
		for(int i=0;i<n;i++) {
			nums[i]=s.nextInt();
		}
		System.out.println("Enter the target element : ");
		int t=s.nextInt();
		int in=o.index(nums, t);
		System.out.println("Index = "+in);
		s.close();
		
		

	}

}
