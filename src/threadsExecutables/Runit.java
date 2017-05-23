package threadsExecutables;

public class Runit {
	
	public static void main(String args[]) {
		Threds firstRun = new Threds("First runnable");
		firstRun.start();
		
		Threds secondRun = new Threds("Second runnable");
		secondRun.start();
	}
}
