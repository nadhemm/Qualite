package tn.insat.repository;

import java.util.List;

import tn.insat.domain.Order;

public interface IOrdersRepository {
	
	// CRUD
	void create(Order o);
	Order findById(String id);
	List<Order> findAll();
	void update(Order o);
	void delete(String id);

}
