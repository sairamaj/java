package toh;

public class ConsolePole implements IPole{
	Disk disk;
	
	ConsolePole(Disk disk){
		this.disk = disk;
	}
	
	public void drawPiece() {
			System.out.print('|');
	}
	
	public void drawBase() {
		for(int i=0; i<10; i++) {
			System.out.print('-');
		}
	}

	public void drawDisks() {
		this.disk.draw();
	}
}
