package com.spring.api.product;



import org.springframework.data.domain.Page;

public interface ProductService {

	 Page<Product> findPaginated(int pageNo,int pageSize);
}

