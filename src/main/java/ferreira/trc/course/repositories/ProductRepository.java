package ferreira.trc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ferreira.trc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
    

