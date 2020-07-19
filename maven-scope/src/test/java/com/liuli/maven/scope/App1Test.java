package com.liuli.maven.scope;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class App1Test {
	
	
	@Before
	public void  init() {
		System.out.println("############### App1Test do somethings in init method #####################");
	}

	
	@After
	public void  close() {
		System.out.println("############### App1Test  do somethings in close method #####################");
	}

	@Test
	public void testMethod1() {
		System.out.println("###########  App1Test do somethings in testMethod1##############");
	}
	
	
}
