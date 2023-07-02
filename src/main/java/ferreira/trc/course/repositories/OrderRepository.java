package ferreira.trc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ferreira.trc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
