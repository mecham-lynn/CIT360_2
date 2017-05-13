package jUnit;

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
		assertEquals(true, output);
	}
}
