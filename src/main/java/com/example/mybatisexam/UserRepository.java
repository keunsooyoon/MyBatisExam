package com.example.mybatisexam;

import java.util.List;

public interface UserRepository {

	//C
	void create(User user);
	
	//R
	List<User> readlist();
	User readdetail(String uno);
	
	//U
	void update(User user);
	
	//D
	void delete(String username);
}