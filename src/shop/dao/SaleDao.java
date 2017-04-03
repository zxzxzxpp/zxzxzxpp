package shop.dao;

import shop.logic.Sale;

public interface SaleDao {

	void create(Sale sale);

	Integer findMaxSaleId();
}