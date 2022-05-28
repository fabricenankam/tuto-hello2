package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import metier.Hello;


class HelloTest {

	@Test
	void testAfficherHello() {
		Hello hel = new Hello();
		Assert.assertEquals("erreur", hel.afficherHello(),"Hello World and welcome !");
	
	}

}
