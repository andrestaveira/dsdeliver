package com.andretaveira.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andretaveira.dsdeliver.dto.ProductDTO;
import com.andretaveira.dsdeliver.entities.Product;
import com.andretaveira.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(p -> new ProductDTO(p)).collect(Collectors.toList());
	}
}
