package net.sergiobelli.gecred.client;

import net.sergiobelli.gecred.business.service.GecredService;
import net.sergiobelli.gecred.model.User;

/**
 * 
 * @author sergio
 *
 */
public class GecredClient {

	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User login ( String username, String password ) {
		return new GecredService().login(username, password);
	}
}
