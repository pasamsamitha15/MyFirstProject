package com.RestDemo.RestDemo.Repository;

import com.RestDemo.RestDemo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{

}
