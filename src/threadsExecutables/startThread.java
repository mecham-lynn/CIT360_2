package threadsExecutables;

public class startThread {
 public static void main(String args[]){
	 MathThread C1 = new MathThread(5);
	 C1.start();
	 
	 MathThread C2 = new MathThread(15);
	 C2.start();
 }
}
