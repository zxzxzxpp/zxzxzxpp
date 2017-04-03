package shop.dao;

import java.util.List;

import shop.logic.Item;

public interface ItemDao {

	List<Item> findAll();

	Item findByPrimaryKey(Integer itemId);
}