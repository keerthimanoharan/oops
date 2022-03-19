package org.college;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("the deposit amount should be 10,000");
}
public static void main(String[] args) {
	AxisBank details=new AxisBank();
	details.deposit();      //overriding
}
}
