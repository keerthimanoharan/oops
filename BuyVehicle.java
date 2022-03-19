package oops;

public class BuyVehicle extends Audi{
	public void modern() {
		System.out.println("moderntech");
	}
	public static void main(String[] args) {
		Audi vehi=new Audi();
		vehi.alloyWheel();
		vehi.applyBrake();
		vehi.automaticGearSystem();
		vehi.engine();
		Bike whee=new Bike();
		whee.applyBrake();
		whee.electricBike();
		whee.engine();
	}}
