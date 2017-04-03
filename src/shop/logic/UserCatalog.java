package shop.logic;

public interface UserCatalog {

	void entryUser(User user);

	User getUserByUserIdAndPassword(String userId, String password);
}