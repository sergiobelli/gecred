package net.sergiobelli.gecred.client;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.engines.URLConnectionEngine;

import net.sergiobelli.gecred.model.User;
import net.sergiobelli.gecred.utils.GsonHandler;


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

		String request = "https://792dyhrgm0.execute-api.us-west-2.amazonaws.com/prod/login?username={username}&password={password}";
		request = request.replace("{username}", username);
		request = request.replace("{password}", password);
		
		javax.ws.rs.core.Response result = 
				new ResteasyClientBuilder().httpEngine(new URLConnectionEngine()).build()
				.target(request)
				.request(MediaType.APPLICATION_JSON)
				.get();
		
		User user = GsonHandler.getGson().fromJson(result.readEntity(String.class), User.class);
		

		return user;
	}
}
