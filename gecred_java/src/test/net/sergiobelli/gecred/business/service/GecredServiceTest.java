package net.sergiobelli.gecred.business.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GecredServiceTest {

	private GecredService service;
	
	@Before
	public void setUp() throws Exception {
		service = new GecredService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoginOk() {
		assertNotNull( service.login("sergio.belli","sergio") );
		assertNotNull( service.login("giuliano.premoli","giuliano") );
		assertNotNull( service.login("corrado.bonardi","corrado") );
	}
	
	@Test
	public void testLoginKo() {
		assertNull( service.login("fake.user","sergio") );
		assertNull( service.login("sergio.belli","fake.pwd") );
		assertNull( service.login("fake.user","fake.pwd") );
	}

}
