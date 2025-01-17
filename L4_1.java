import java.util.Scanner;
public class L4_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String a=s.nextLine();
		int vowel=0;
		int consonent=0;
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(c=='a' || c=='A'|| c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U') {
				vowel++;
			}
			else if(c!=' '){
				consonent++;
			}
		}
		System.out.println("No.of consonents = "+consonent);
		System.out.println("No.of vowels = "+vowel);

	}

}
