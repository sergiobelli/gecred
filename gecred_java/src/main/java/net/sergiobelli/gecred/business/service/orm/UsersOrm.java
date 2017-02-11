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
		
		String resource = "net/sergiobelli/gecred/business/service/orm/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	public User login ( String username, String password ) {
		
		User result = null;
		
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("username", username);
			params.put("password", password);
			
			result = (User) session.selectList( "net.sergiobelli.gecred.business.service.orm.GCUserMapper.login", params ).get(0);
			
		} catch ( Exception ex ) {
			
			ex.printStackTrace();
			
		} finally {
			
			session.close();
			
		}
		
		return result;
		
	}
	
	
	
	
}
