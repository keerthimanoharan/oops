package oops;

public class Pc extends Laptop {
	public void getSystemInfo() {
		System.out.println("the system information is MAC");
	}
public static void main(String[] args) {
	Pc data=new Pc();
	data.getSystemInfo();    //override
}
}
