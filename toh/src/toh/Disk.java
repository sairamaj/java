package toh;

public class Disk {
	int length;
	
	Disk(int length){
		this.length = length;
	}
	
	void draw() {
		for(int i=0; i<length; i++) {
			System.out.print('_');
		}
		System.out.println("");
	}
}
