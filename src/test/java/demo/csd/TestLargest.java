package demo.csd;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLargest {
Largest large;
	@Before
	public void setUp() throws Exception {
		large = new Largest();
	}

	@After
	public void tearDown() throws Exception {
		large = null;
	}

	@Test
	public void testCase1() {
		int arr[]={4,5,6,9,2};
		assertEquals(9,large.validate(arr));
	}
	@Test
	public void testCase3() {
		int arr[]={4,5,6,9,2};
		assertEquals(8,large.validate(arr));
	}


}
