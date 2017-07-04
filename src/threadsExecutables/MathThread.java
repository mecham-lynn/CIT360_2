package threadsExecutables;

class MathThread implements Runnable {
	private Thread x;
	private int mathValue;
	
	MathThread(int math){
		mathValue = math;
		System.out.println("This thread will do squares of figures starting with 5");
	}
public void run(){
	System.out.println("Starting Calculations");
	try {
		for (int y = 5; y > 0; y--){
			System.out.println("Calculate"+ mathValue +"^ "+ y +" = "+ Math.pow(mathValue, y));
			Thread.sleep(100);
			}
		}catch(InterruptedException e){
			System.out.println("Calculation Interrupted!!!!!");
		}
		System.out.println("Calculation ended");
	}
public void start(){
	System.out.println("Beginning Calculation");
	if (x == null){
		x = new Thread(this, "Calculation");
		x.start();
	}
  }
}
