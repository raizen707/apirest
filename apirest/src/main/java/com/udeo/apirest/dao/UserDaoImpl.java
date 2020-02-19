package com.udeo.apirest.dao;

import java.util.List;

import com.udeo.apirest.Entity.User;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> selectQuery = currentSession.createQuery("from user", User.class);
		List<User> users = selectQuery.getResultList();
		return users;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		User user = currentSession.get(User.class, id);
		return user;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<User> deleteQuery = currentSession.createQuery("delete from user where id=:idUser");
		deleteQuery.setParameter("idUser", id);
		deleteQuery.executeUpdate();

	}

}
