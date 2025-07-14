package com.RestDemo.RestDemo.Services;

import com.RestDemo.RestDemo.Entities.Product;
import com.RestDemo.RestDemo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id)
    {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));

    }

    public Product addProduct(Product product)
    {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productdetails){
        Product product=getProductById(id);
        product.setName(productdetails.getName());
        product.setPrice(productdetails.getPrice());
        product.setDescription(productdetails.getDescription());

        return productRepository.save(product);
    }

    public void deleteProduct(Long id)
    {
        productRepository.deleteById(id);
    }
}
