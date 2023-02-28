package com.andretaveira.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andretaveira.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
