package org.wg.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.wg.dao.UserDAO;
import org.wg.model.User;

import javax.annotation.Resource;

@Component("u")
public class UserDAOImpl implements UserDAO {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(User user) {

        //Hibernate
        //JDBC
        //XML
        //NetWork
        System.out.println("session factory class:" + sessionFactory.getClass());
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        s.save(user);
        s.getTransaction().commit();
        System.out.println("user saved!");
        //throw new RuntimeException("exeption!");
    }

}
