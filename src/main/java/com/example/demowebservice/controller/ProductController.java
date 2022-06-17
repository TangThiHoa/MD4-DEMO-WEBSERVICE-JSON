package com.example.demowebservice.controller;

import com.example.demowebservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demowebservice.service.IProductService;

@Controller
@CrossOrigin("*")  //cho phép truy cập từ dự án bên ngoài /Cấp quyền truy cập rộng hơn
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping("")
    public ResponseEntity<Iterable<Product>> findAll(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity add(@RequestBody Product product){
        productService.sava(product);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/order-by-price")
    public ResponseEntity<Iterable<Product>> findAllByOrderByPrice(){
        return new ResponseEntity<>(productService.findAllByOrderByPrice(), HttpStatus.OK);
    }

}
