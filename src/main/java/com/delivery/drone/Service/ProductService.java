package com.delivery.drone.Service;
import com.delivery.drone.Dto.ProductDto;
import com.delivery.drone.Model.Product;
import com.delivery.drone.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements  IProductService{
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product saveProduct(ProductDto productDto) {
        Product product = new Product();
        product.setProductName(productDto.getProductName());
        product.setProductPrice(productDto.getProductPrice());
       return productRepository.save(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        for(Product product: productList){
            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setProductName(product.getProductName());
            productDto.setProductPrice(product.getProductPrice());
            productDtoList.add(productDto);
        }
        return productDtoList;
    }
}
