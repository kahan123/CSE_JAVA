import java.util.Scanner;

class vowel_count{
	
	void start () {
		vowel_count o=new vowel_count();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence or 'Quit' to quit");
		String sen=s.nextLine();
		while(!sen.equals("Quit")) {
			o.count(sen);
			System.out.println("Enter a sentence or 'Quit' to quit");
			sen=s.nextLine();
		}
	}
	
	void count(String sen) {
		int vcount[]=new int[5];
		for(int i=0;i<sen.length();i++) {
			char c=sen.charAt(i);
			if(c=='a' || c=='A') {
				vcount[0]++;
			}
			else if(c=='e' || c=='E') {
				vcount[1]++;
			}
			else if(c=='i' || c=='I') {
				vcount[2]++;
			}
			else if(c=='o' || c=='O') {
				vcount[3]++;
			}
			else if(c=='u' || c=='U') {
				vcount[4]++;
			}
			
		}
		System.out.println("Count of vowels : ");
		System.out.println("1.a="+vcount[0]);
		System.out.println("2.e="+vcount[1]);
		System.out.println("3.i="+vcount[2]);
		System.out.println("4.o="+vcount[3]);
		System.out.println("5.u="+vcount[4]);
		
		
	}
}

public class L6_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		vowel_count o=new vowel_count();
		o.start();
		
	}

}
