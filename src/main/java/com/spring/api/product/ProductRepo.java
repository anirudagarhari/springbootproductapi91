package com.spring.api.product;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository

     public interface ProductRepo extends PagingAndSortingRepository<Product,Integer>{


	
}










