package shop.dao;

import shop.logic.User;

public interface UserDao {

	void create(User user);

	User findByUserIdAndPassword(String userId, String password);
}