package tn.insat.business;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.insat.domain.Order;
import tn.insat.repository.IOrdersRepository;

@Service
public class OrdersBusinessImpl implements IOrdersBusiness {

	@Autowired
	//@Qualifier("ordersRepositoryImpl2")
	private IOrdersRepository repo;  // DEPEND ON ABSTRACTIONS !!!
	
	
	public IOrdersRepository getRepo() {
		return repo;
	}

	public void setRepo(IOrdersRepository repo) {
		this.repo = repo;
	}

	@Override
	public BigDecimal computeTotalOrderPrice(String id) {
		
		Order order = repo.findById(id);
		
		return order.getProducts()
				.stream()
				.map(p -> p.getUnitPrice())
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
