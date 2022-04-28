package com.spring.api.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;




@Service
public class ProductServicelmpl implements ProductService{

	@Autowired
	private ProductRepo Prepo;

	@Override
	public Page<Product> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo -1, pageSize);
		return this.Prepo.findAll(pageable);
	}
}







