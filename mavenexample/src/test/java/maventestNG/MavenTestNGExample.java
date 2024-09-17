package maventestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MavenTestNGExample {

	@Test
	public void myTest() {
		System.out.println(" I am in my test");
	}

	@BeforeClass
	public void myBeforeClass() {
		System.out.println(" I am in my before class method");
	}

	@AfterClass
	public void myAfterClass() {
		System.out.println(" I am in my after class method");

	}

}
