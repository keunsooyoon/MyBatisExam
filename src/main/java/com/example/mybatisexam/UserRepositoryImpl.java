package com.example.mybatisexam;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void create(User user) {
		sqlSessionTemplate.insert("user.create", user);

	}

	@Override
	public List<User> readlist() {
		return sqlSessionTemplate.selectList("user.readlist");
	}

	@Override
	public User readdetail(String uno) {
		return sqlSessionTemplate.selectOne("user.readdetail", uno);
	}

	@Override
	public void update(User user) {
		sqlSessionTemplate.update("user.update", user);

	}

	@Override
	public void delete(String username) {
		sqlSessionTemplate.delete("user.delete", username);

	}

}