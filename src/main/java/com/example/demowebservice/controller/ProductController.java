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
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping("/products")
    public ResponseEntity<Iterable<Product>> findAll(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/products")
    public ResponseEntity add(@RequestBody Product product){
        productService.sava(product);
        return new ResponseEntity(HttpStatus.OK);


    }

}
