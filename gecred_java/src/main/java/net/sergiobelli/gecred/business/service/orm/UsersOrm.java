package net.sergiobelli.gecred.business.service.orm;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import net.sergiobelli.gecred.model.User;


public class UsersOrm {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public UsersOrm () throws IOException {
		
		String configFile = "net/sergiobelli/gecred/business/service/orm/mybatis-config.xml";
		InputStream configFileIS = Resources.getResourceAsStream(configFile);
//		String configFileString = convertStreamToString(configFileIS); 
		
//		String mapperFile = "net/sergiobelli/gecred/business/service/orm/GCUsersMapper.xml";
//		InputStream mapperFileIS = Resources.getResourceAsStream(mapperFile);
//		String mapperFileString = convertStreamToString(mapperFileIS); 
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(configFileIS);
	}
	
	static String convertStreamToString(java.io.InputStream is) {
	    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}
	
	public User login ( String username, String password ) {
		
		User result = null;
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("username", username);
			params.put("password", password);
			
			result = (User) session.selectList( "net.sergiobelli.gecred.business.service.orm.GCUsersMapper.login", params ).get(0);
			
		} catch ( Exception ex ) {
						
		} finally {
			
			session.close();
			
		}
		
		return result;
		
	}
	
	
	
	
}
