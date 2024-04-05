package git115;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class program4Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCountDigitforZero() {
		program4 counter=new program4();
		int results=counter.countDigits(0);
		
		assertEquals(1,results);
		
		
		
	}
	@Test
	public void testCountDigitForPositiveNumber() {
		program4 counter=new program4();
		int results=counter.countDigits(10987);
		
		assertEquals(5,results);
	}
	@Test
	public void testCountDigitforNegativeNumber() {
		program4 counter=new program4();
		int results=counter.countDigits(-123);
		
		assertEquals(3,results);


}
