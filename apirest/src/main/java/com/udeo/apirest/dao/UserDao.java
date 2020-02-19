package com.udeo.apirest.dao;
import com.udeo.apirest.Entity.User;
import java.util.List;

public interface UserDao {
	public List<User> findAll();
	
	public User findById(int id);
	
	public void save (User user);
	
	public void delete (int id);
}
