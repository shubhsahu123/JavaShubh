package methodoverriding;

public class HomeLoan {
	public static void main(String[] args) {
		
	
		Bank[] bank=new Bank[3] ;


	bank[0]=new AxisBank();
	bank[1]=new HdfcBank();
	bank[2]=new ICICIBank();
	
	loanEnquiry(bank);
	
	Bank b=new Bank();
	System.out.println(b.InterestRate());
	System.out.println(b.getName());
}
public static void loanEnquiry(Bank[] bank) {
	for (Bank b : bank) {
		String name =b.getName();
		double interestRate=b.InterestRate();
		System.out.println(name+"    "+interestRate);
		
	}
	
}


}
