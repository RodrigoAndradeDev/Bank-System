package sysAccount;

public class SysAccountUser {
	
	private int number;
	private String holder;
	private double value;
	
	
	public SysAccountUser(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	public SysAccountUser(int number, String holder, double value) {
		super();
		this.number = number;
		this.holder = holder;
		this.value = value;
	}
	public SysAccountUser() {
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getValue() {
		return value;
	}
	
	public void deposit(double deposit_money) {
		this.value += deposit_money;
	}
	
	public void whithdraw(double whithdraw_money) {
		this.value -= (whithdraw_money+5);
	}
	
	public String toString() {
		return "Account " + this.number + ", Holder: " + this.holder + ", Balance: " + this.value;
	}
	
	
	
	
	
	
	
	

}
