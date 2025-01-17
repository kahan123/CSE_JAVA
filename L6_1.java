import java.util.Scanner;
public class L6_1 {
	
	void area_circle(double r) {
		double area=3.141592*r*r;
		System.out.println("area = "+area);
	}

	public static void main(String[] args) {
		L6_1 o=new L6_1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		double r=s.nextDouble();
		o.area_circle(r);
	}

}