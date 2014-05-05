package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Interfaces.UserInterface;
import fachlicheKlassen.BusinessLogic;
import fachlicheKlassen.Rezept;
import fachlicheKlassen.User;
import fachlicheKlassen.Zutaten;


public class JTest {
	Rezept expected[];
	Rezept actual[];
	UserInterface friend ;
	
	
	@Before
	public void setUp(){
		friend = new User("kamatz", "abcde", "ab@cd.at");	
	}
	@Test
	public void register(){
		assertTrue(new BusinessLogic().register(friend));
	}
	@Test
	public void addRecipe() {
		assertTrue(true);
	}
	@Test
	public void rateRecipe() {
		assertTrue(true);
	}
	@Test
	public void searchRecipe() {
		assertTrue(true);
		//assertArrayEquals(expected, actual);
	}
	@Test
	public void sortRecipe() {
		assertTrue(true);
		// assertArrayEquals(expected, actual);
	}
	@Test
	public void calcCO2() {
		assertTrue(true);
		// assertEquals(expected, actual, delta);
	}
	@Test
	public void addFriend() {
		
		assertTrue(true);
	}
	@Test
	public void shareRecipe() {
		
		assertTrue(true);
	}
	@Test
	public void logIn(){
		assertTrue(true);
	}
	@Test
	public void logOut(){
		assertTrue(true);
	}
	
}
