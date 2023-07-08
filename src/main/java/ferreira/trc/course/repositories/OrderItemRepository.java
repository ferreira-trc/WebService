package ferreira.trc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ferreira.trc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
