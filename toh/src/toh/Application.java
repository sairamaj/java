package toh;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<IPole> poles = new ArrayList<IPole>();
		for (int i = 0; i < 3; i++) {
			poles.add(PartsFactory.createPole(new Disk(10)));
		}

		int poleLength = 5;
		for (int i = 0; i < poleLength; i++) {
			fillPoleGap(20);
			for (IPole pole : poles) {
				pole.drawPiece();
				fillPoleGap(20);
			}
			
			System.out.println("");
		}
		
		fillPoleGap(15);
		for (IPole pole : poles) {
			pole.drawBase();
			fillPoleGap(11);
		}
	}

	static void fillPoleGap(int gapLength) {
		for (int i = 0; i < gapLength; i++) {
			System.out.print(' ');
		}
	}

}
