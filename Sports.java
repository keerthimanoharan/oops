package oops;

public class Sports {
public void acheiver(String name,int medalcount) {
	System.out.println(name+""+medalcount);
}
public void acheiver(String country ,String sportName, int rank) {
	System.out.println(country+""+sportName+""+rank);
}
public void acheiver(float weight, int height, long contactNo) {
	System.out.println(weight+""+height+""+contactNo);
	}
public void acheiver(String tournamentName, long prizeMoney) {
	System.out.println(tournamentName+""+prizeMoney);
}
	public static void main(String[] args) {
	Sports play=new Sports();
	play.acheiver("keerthi", 8);
	play.acheiver("gandhi", 3550000l);
	play.acheiver(25, 41, 14l);
	play.acheiver("India", "Hockey", 2);
	}}
