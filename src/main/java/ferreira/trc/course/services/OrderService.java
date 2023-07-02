package ferreira.trc.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.trc.course.entities.Order;
import ferreira.trc.course.repositories.OrderRepository;


@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findBuId(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
