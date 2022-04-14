
public class BankAccount {
	
		
		protected double balance;
		
		BankAccount(){
			
		}
		
		BankAccount(double balance){
			this.balance = balance;
			
		}
		
	   public void showAccountBalance() {
		   System.out.println("Account Balance is " + balance);
		}
	   
	   public void withdrawalBalance(double withdraw) {
		   
		   if(withdraw > balance) {
			   System.out.println("Insufficient Balance cannot withdraw " + withdraw + " because available balance is " + balance);
		   }
		   else {
		   balance = balance - withdraw;
		   }
		 
	 }
	   public void creditBalance(double credit) {
		   if (credit <= 0) {
			   System.out.println("Invalid credit Amount");
		   }else {
		   balance = balance + credit;
		   }
	   }
	   
	   public static void main(String[] args) {
		   
		   BankAccount b1 = new BankAccount(5000.00);
		   BankAccount b2 = new BankAccount(20000.00);
		   System.out.print("withdrawing 5400 from b1: ");
		   b1.withdrawalBalance(5400);
		   System.out.print("Available balance of b1 is: ");
		   b1.showAccountBalance();
		   System.out.print("After adding 200 to b1, b1 account Balance is: ");
		   b1.creditBalance(200);
		   b1.showAccountBalance();
		   System.out.print("withdrawing 400 from b1: ");
		   b1.withdrawalBalance(400);
		   b1.showAccountBalance();
		   
		   System.out.println("The loan amount on b1 can be availed is: " +LoanAmount.loanCalculator(b1));
		   
		   System.out.print("The balance of b2 is: ");
		   b2.showAccountBalance();
		   
		   System.out.println("The loan amount on b2 can be availed is: " +LoanAmount.loanCalculator(b2));
		   
			
	   }
	}

	class LoanAmount extends BankAccount{

		public static double loanCalculator(BankAccount b) {
			return (b.balance*80)/100;
	}
	}



