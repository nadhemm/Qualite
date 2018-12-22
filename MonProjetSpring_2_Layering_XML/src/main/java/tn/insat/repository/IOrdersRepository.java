package tn.insat.repository;

import tn.insat.domain.Order;

import java.util.List;

public interface IOrdersRepository {
	
	// CRUD
	void create(Order o);
	Order findById(String id);
	List<Order> findAll();
	void update(Order o);
	void delete(String id);

}
