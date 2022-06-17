package com.example.demowebservice.service;

import com.example.demowebservice.model.Product;

public interface IProductService extends IService<Product>{
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(int from , int to);

}
