package org.wg.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.wg.dao.UserDAO;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserDAO u1 = (UserDAO)ctx.getBean("userDAO");
		System.out.println(u1);
	}

}
