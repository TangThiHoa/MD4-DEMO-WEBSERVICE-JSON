package com.example.demowebservice.reponsitory;

import com.example.demowebservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Iterable<Product> findAllByOrderByPrice();

}
