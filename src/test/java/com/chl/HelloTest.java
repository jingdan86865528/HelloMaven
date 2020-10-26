package com.chl;

import org.junit.Test;

/**
 * 
 * @author Administrator
 *
 */
public class HelloTest {
	@Test
	public void testHello() {
		Hello hello = new Hello();
		String maven = hello.sayHello("Maven");
		System.out.println(maven);
	}
}
