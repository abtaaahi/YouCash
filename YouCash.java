package YouCashPackage;
import java.util.*;

public class YouCash {
	String Name;
	int balance;
	String PIN;
	
	void SendMoney(int amount) {
		if(amount<balance) {
			this.balance-=amount;
			System.out.println("Send Money Successful !\n");
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance!\n");
		}
		main(null);
		}
	
	void MobileRecharge(int amount) {
		if(amount<balance) {
			this.balance-=amount;
			System.out.println("Mobile Recharge Successful !\n");
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance!\n");
		}
		main(null);
	}
	
	void Payment(int amount) {
		if(amount<balance) {
			this.balance-=amount;
			System.out.println("Payment Successful !\n");
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance!\n");
		}
		main(null);
	}
	
	void CashOut(int amount) {
		if(amount<balance) {
			this.balance-=amount;
			System.out.println("Cash Out Successful !\n");
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance!\n");
		}
		main(null);
	}
	
	void CashIn(int amount) {
		this.balance+=amount;
			System.out.println("Cash In Successful !\n");
			System.out.println("Current Balance: "+balance);
			main(null);
	}
	
	void PayBill(int amount) {
		if(amount<balance) {
			this.balance-=amount;
			System.out.println("Pay Bill Successful !\n");
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance!\n");
		}
		main(null);
	}
	
	
	public static void main(String[] args) {
		
		YouCash Mahib=new YouCash();
		Mahib.Name="Abtahi Md. Mahib Uddin";
		Mahib.balance=2230;
		Mahib.PIN="abcd";
		System.out.println("YouCash\r\n"+ "\r\n"
				+ "1.Send Money\r\n"
				+ "2.Mobile Recharge\r\n"
				+ "3.Payment\r\n"
				+ "4.Cash Out\r\n"
				+ "5.Cash In\r\n"
				+ "6.Pay Bill\n");
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		String Y;
		Scanner s=new Scanner(System.in);
		Scanner p=new Scanner(System.in);
		Scanner am=new Scanner(System.in);
		int a;
		String UPIN;
		if(X==1) {
			System.out.println("Enter Account Name: ");
			Y=s.nextLine();
			System.out.println("Enter your PIN: ");
			UPIN=p.nextLine();
			if(Mahib.PIN.equals(UPIN)) {
				System.out.println("Enter Amount to Send: ");
				a=am.nextInt();
				Mahib.SendMoney(a);
			}
			else {
				System.out.println("Incorrect PIN!");
			}
		}
		if(X==2) {
			System.out.println("Enter Phone Number: ");
			Y=s.nextLine();
			System.out.println("Enter your PIN: ");
			UPIN=p.nextLine();
			if(Mahib.PIN.equals(UPIN)) {
				System.out.println("Enter Amount to Send: ");
				a=am.nextInt();
				Mahib.MobileRecharge(a);
			}
			else {
				System.out.println("Incorrect PIN!");
			}
		}
		if(X==3) {
			System.out.println("Enter Shop Name: ");
			Y=s.nextLine();
			System.out.println("Enter your PIN: ");
			UPIN=p.nextLine();
			if(Mahib.PIN.equals(UPIN)) {
				System.out.println("Enter Payment Amount: ");
				a=am.nextInt();
				Mahib.Payment(a);
			}
			else {
				System.out.println("Incorrect PIN!");
			}
		}
		if(X==4) {
			System.out.println("Enter Agent Number: ");
			Y=s.nextLine();
			System.out.println("Enter your PIN: ");
			UPIN=p.nextLine();
			if(Mahib.PIN.equals(UPIN)) {
				System.out.println("Enter Cash Out Amount: ");
				a=am.nextInt();
				Mahib.CashOut(a);
			}
			else {
				System.out.println("Incorrect PIN!");
			}
		}
		if(X==5) {
			System.out.println("Enter Agent Number: ");
			Y=s.nextLine();
			System.out.println("Enter your PIN: ");
			UPIN=p.nextLine();
			if(Mahib.PIN.equals(UPIN)) {
				System.out.println("Enter Cash In Amount: ");
				a=am.nextInt();
				Mahib.CashIn(a);
			}
			else {
				System.out.println("Incorrect PIN!");
			}
		}
		if(X==6) {
			System.out.println("Enter Pay Bill Destination: ");
			Y=s.nextLine();
			System.out.println("Enter your PIN: ");
			UPIN=p.nextLine();
			if(Mahib.PIN.equals(UPIN)) {
				System.out.println("Enter Payment Amount: ");
				a=am.nextInt();
				Mahib.PayBill(a);
			}
			else {
				System.out.println("Incorrect PIN!");
			}
		}
	}
}
