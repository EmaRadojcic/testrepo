package ie.gmit.testpackage;
import java.util.*; // For Date obj

public class Breed {

	public String dogbreed;
	public String dogname;
	public String dogID;
	

	
	public Breed(String dogbreed, String dogname) {
		this.dogname= dogname;
		this.dogbreed = dogbreed;
	}
	
	
	
	public String getDogbreed() {
		return dogbreed;
	}

	public void setDogbreed(String dogbreed) {
		this.dogbreed = dogbreed;
	}
	
	public String getDogName() {
		return dogname;
	}

	public void setDogname(String dogname) {
		this.dogname = dogname;
	}
	
}
