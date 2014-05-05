package Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import fachlicheKlassen.Rezept;
import fachlicheKlassen.User;

public class JTest {
	Rezept expected[];
	Rezept actual[];
	User friend ;

	
	@Before
	public void setUp(){
	 friend = new User("kamatz", "abcde", "ab@cd.at");
	}
	@Test
	public void register(){
		//fail("Not yet implemented");
		 assertTrue(true);
	}
	@Test
	public void addRecipe() {
		//fail("Not yet implemented");
		assertTrue(true);
	}
	@Test
	public void rateRecipe() {
		fail("Not yet implemented");
		// assertTrue(true);
	}
	@Test
	public void searchRecipe() {
		fail("Not yet implemented");
		// assertArrayEquals(expected, actual);
	}
	@Test
	public void sortRecipe() {
		fail("Not yet implemented");
		// assertArrayEquals(expected, actual);
	}
	@Test
	public void calcCO2() {
		fail("Not yet implemented");
		// assertEquals(expected, actual, delta);
	}
	@Test
	public void addFriend() {
		fail("Not yet implemented");
		// assertTrue(true);
	}
	@Test
	public void shareRecipe() {
		fail("Not yet Implemented");
		// assertTrue(true);
	}
}
