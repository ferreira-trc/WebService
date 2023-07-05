package ferreira.trc.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ferreira.trc.course.entities.Product;
import ferreira.trc.course.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findBuId(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}