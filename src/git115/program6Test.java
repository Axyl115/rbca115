package git115;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class program6Test {

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
	public void testPerson() {
		 //Create two instances of the Person class
			program6 person1 = new program6 ("John", 30);
			program6  person2 = new program6("Alice", 25);

		        // Test the attributes of the first person
		        assertEquals("John", person1.getName());
		        assertEquals(30, person1.getAge());

		        // Test the attributes of the second person
		        assertEquals("Alice", person2.getName());
		        assertEquals(25, person2.getAge());
	}
	}
	}

}
