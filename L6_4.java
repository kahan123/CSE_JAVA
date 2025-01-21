import java.util.Scanner;

class Bank_Account {
	int accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;
	
	void getAccountDetails(Bank_Account A) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Account NO. : ");
		A.accountNo=s.nextInt();
		System.out.println("Enter user name : ");
		A.userName=s.next();
		System.out.println("Enter email : ");
		A.email=s.next();
		System.out.println("Enter Account Type : ");
		A.accountType=s.next();
		System.out.println("Enter Account Balance : ");
		A.accountBalance=s.nextInt();
	}
	
	void displayAccountDetails(Bank_Account A) {
		System.out.println("Account NO. : "+A.accountNo);
		System.out.println("user name : "+A.userName);
		System.out.println("email : "+A.email);
		System.out.println("Account Type : "+A.accountType);
		System.out.println("Account Balance : "+A.accountBalance);
	}
}



public class L6_4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bank_Account a1=new Bank_Account();
		a1.getAccountDetails(a1);
		a1.displayAccountDetails(a1);
	}

}
