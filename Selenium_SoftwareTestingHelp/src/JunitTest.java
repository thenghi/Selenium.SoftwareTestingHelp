import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

import com.beust.jcommander.Parameterized;

public class JunitTest {
	
	@BeforeClass
	public static void BeforeTest(){
		System.out.println("Before test");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("Running JUnit Test");
		//Assert.assertEquals(1, 1);
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		System.out.println("Running 2nd JUnit Test");
		//Assert.assertEquals(1, 1);
	}
	
	@AfterClass
	public static void AfterTest(){
		System.out.println("Running after test");
	}

}
