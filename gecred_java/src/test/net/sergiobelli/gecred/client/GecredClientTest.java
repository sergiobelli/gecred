package net.sergiobelli.gecred.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GecredClientTest {

	private GecredClient client;
	
	@Before
	public void setUp() throws Exception {
		client = new GecredClient();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoginOk() {
		assertNotNull( client.login("sergio.belli", "sergio") );
		assertNotNull( client.login("giuliano.premoli", "giuliano") );
		assertNotNull( client.login("corrado.bonardi", "corrado") );
	}

	@Test
	public void testLoginKo() {
		assertNull( client.login("sergio.belli", "fake") );
		assertNull( client.login("fake", "giuliano") );
		assertNull( client.login("fake", "fake") );
	}
	
}
