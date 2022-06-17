package com.example.demowebservice.service;

import java.util.Optional;

public interface IService<T> {
    void sava(T t);

    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void remove(Long id);

}