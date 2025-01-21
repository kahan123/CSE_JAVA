import java.util.Scanner;

class complex_no{
	int real;
	int imaginary;
	
	void getno (complex_no a) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter real part : ");
		a.real=s.nextInt();
		System.out.println("Enter Imaginary part : ");
		a.imaginary=s.nextInt();
	}
	
	complex_no add(complex_no a,complex_no b) {
		complex_no c=new complex_no();
		c.real=a.real+b.real;
		c.imaginary=a.imaginary+b.imaginary;
		
		return c;
	
	}
	
	void display(complex_no a) {
		System.out.println("Real part : "+a.real);
		System.out.println("Rimaginary part : "+a.imaginary);
	}
}

public class L6_5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first complex No. : ");
		complex_no a=new complex_no();
		a.getno(a);
		System.out.println("Enter Second complex No. : ");
		complex_no b=new complex_no();
		b.getno(b);
		System.out.println("Resultant complex No. : ");
		complex_no c=new complex_no();
		c=c.add(a, b);
		c.display(c);
	}

}
