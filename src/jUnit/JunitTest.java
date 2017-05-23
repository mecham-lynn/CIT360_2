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
	public Object nullTester(){
		
		Object nullTest = null;
		return nullTest;
	}
	public String sameString(String str2){
		String str = "hello";
		return str;
	}
	public String[] arrayEqualsTest(){
		String[] expectedArray = {"Hello","Hola","Konichiwa"};
		
		return expectedArray;
	}
}
