package com.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App app=new App();
		int expected=2;
		int actual=app.add(1,1);
		System.out.println("this is ran");
		assertEquals(expected,  actual);
	}

}
