package net.sergiobelli.gecred.business.handler;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.RequestHandler;

import net.sergiobelli.gecred.business.service.GecredService;
import net.sergiobelli.gecred.model.User;

public class GecredHandler implements RequestHandler<User, User> {

	public User handleRequest( User request, Context context ) {

		GecredService service = new GecredService();
		User result = service.login(request.getUsername(), request.getPassword());

		return result;
	}

}
