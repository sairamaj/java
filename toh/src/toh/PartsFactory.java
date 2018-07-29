package toh;

public class PartsFactory {
	static IPole createPole(Disk disk) {
		return new ConsolePole(disk);
	}
}
