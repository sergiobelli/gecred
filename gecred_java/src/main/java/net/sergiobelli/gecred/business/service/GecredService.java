package net.sergiobelli.gecred.business.service;

import java.io.IOException;

import net.sergiobelli.gecred.business.service.orm.UsersOrm;
import net.sergiobelli.gecred.model.User;

/**
 * 
 * @author sergio
 *
 */
public class GecredService {

	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User login( String username, String password ) {

		User user = null;
		try {

			UsersOrm orm = new UsersOrm();

			user = orm.login(username, password);

		} catch (IOException e) {

			e.printStackTrace();

		}

		return user;
	}

}
