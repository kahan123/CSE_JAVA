import java.util.Scanner;

class time {
	int hour;
	int minute;
	
	time add(time t1, time t2) {
		time t3=new time();
		t3.minute=t1.minute+t2.minute;
		t3.hour=t1.hour+t2.hour;
		if(t3.minute>=60) {
			t3.minute=t3.minute-60;
			t3.hour++;
		}
		return t3;
	}
}

public class L6_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		time t1=new time();
		time t2=new time();
		System.out.println("Enter Hours and Minutes of time 1 : ");
		t1.hour=s.nextInt();
		t1.minute=s.nextInt();
		System.out.println("Enter Hours and Minutes of time 2 : ");
		t2.hour=s.nextInt();
		t2.minute=s.nextInt();
		
		time o=new time();
		time t3=new time();
		t3=o.add(t1, t2);
		
		System.out.println("Resultant Hours and Minutes : "+t3.hour+"'"+t3.minute);
		
		
		
	}

}
