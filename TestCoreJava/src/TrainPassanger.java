import java.util.Random;

public class TrainPassanger {
	private long pnr;
	private String name;
	private int age;
	private char gender;
	
	TrainPassanger(String varname,int varage,char vargender){
		pnr = new Random().nextLong();
		name = varname;
		age = varage;
		gender =vargender;
		}
	public String getname(){
	return name;
	}

	public int getAge() {
		return age;
	}
	
	public char getGen() {
		return gender;
	}
	
	public long getPnr() {
		return pnr;
	}
}
