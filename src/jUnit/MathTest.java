package jUnit;
import static org.junit.Assert.*;
import junit.framework.TestCase;

public class MathTest extends TestCase {

	public void test(){
		JunitTest test = new JunitTest();
		int output = test.math(5);
		assertEquals(50, output);
	}
	public void test2(){
		JunitTest test = new JunitTest();
		boolean output = test.isItTrue(5);
		assertTrue(output);
	}
	public void test3(){
		JunitTest test = new JunitTest();
		boolean output = test.isItTrue(10);
		assertFalse(output);
	}
	public void test4(){
		JunitTest test = new JunitTest();
		int output = test.math(5);
		assertNotNull(output);
	}
	public void test5(){
		JunitTest test = new JunitTest();
		Object output = test.nullTester();
		assertNull(output);
	}
	public void test6(){
		JunitTest test = new JunitTest();
		String output = test.sameString("hello");
		assertSame("hello", output);
	}
	public void test7(){
		JunitTest test = new JunitTest();
		String output = test.sameString("Bye");
		assertNotSame("Bye",output);
	}
	public void test8(){
		JunitTest test = new JunitTest();
		String[] output = {"Hello","Hola","Konichiwa"};
		String[] received = test.arrayEqualsTest();

		assertArrayEquals(output, received);
	}
}
