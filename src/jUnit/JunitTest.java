package jUnit;

public class JunitTest {

	public int math(int x){
		
		return (x+x)*x;
	}
	public boolean isItTrue(int y){
		boolean examine = false;
		if (y * y == 25){
			System.out.println("This value is true");
			examine = true;
		}
		else{
			System.out.println("This value is false");
		}
		return examine;
		
	}
}
