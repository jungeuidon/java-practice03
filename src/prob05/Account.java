package prob05;

public class Account {
	
	private String accountNo; //계좌번호
	private int balance=0; //잔고
	
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}

	
	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public int getBalance() {
		return balance;
	}
	
	public int save(int money) {
		balance = getBalance()+money;
		System.out.println(getAccountNo() + " 계좌에 " + money + "만원이 입금되었습니다.");
		return balance;
	}
	
	public int deposit (int money) {
		balance = getBalance()-money;
		System.out.println(getAccountNo() + " 계좌에 " + money + "만원이 출금되었습니다.");
		return balance;
	}
	
	
	
	
}
