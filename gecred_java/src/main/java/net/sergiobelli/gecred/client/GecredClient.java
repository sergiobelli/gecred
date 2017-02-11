package net.sergiobelli.gecred.client;

import net.sergiobelli.gecred.business.service.GecredService;
import net.sergiobelli.gecred.model.User;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
//
//import net.sergiobelli.gecred.business.service.GecredService;
//import net.sergiobelli.gecred.model.User;


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

//		ResteasyClient client = new ResteasyClientBuilder().build();
//		ResteasyWebTarget target = client.target("http://localhost:8080/RESTEasyApplication/user-management/users");
//		Response response = target.request().get();
//		String value = response.readEntity(String.class);
//		System.out.println(value);
//		response.close();  


		return new GecredService().login(username, password);
	}
}
