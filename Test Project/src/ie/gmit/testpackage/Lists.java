package ie.gmit.testpackage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lists {

	List<Breed> breeds;

	// Constructor - instantiate students ArrayList
	public Lists() {
		breeds = new ArrayList<Breed>();
	}

	// add function
	public boolean add(Breed b) {
		try {
			return breeds.add(b);
		} catch (Exception error) {
			error.printStackTrace();
			return false;
		}
	}

	public int seeDogs() {
		// returns the current number of Students in the ArrayList
		return breeds.size();
	}

	public Breed getDogID() {
		for (Breed breed : breeds) {
			return breed;
			}
		return null;
	}
	

}
// del function
