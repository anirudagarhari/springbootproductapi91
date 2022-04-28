package com.spring.api.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class producservicee {

	@Autowired
	private ProductRepo Prepo;
	
	public Page<Product> listAll(int pageNumber){
		Pageable pageable=PageRequest.of(pageNumber -1, 5);
		return Prepo.findAll(pageable);
	}
}




