package net.sergiobelli.gecred.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author sbelli
 *
 */
public class GsonHandler {

	/**
	 * 
	 * @return
	 */
	public static final Gson getGson() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setDateFormat("dd-MM-yyyy");
		Gson gson = gsonBuilder.create();
		return gson;
	}
	
}
