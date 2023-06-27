package com.delivery.drone.Service;

import com.delivery.drone.Dto.ProductDto;
import com.delivery.drone.Model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(ProductDto productDto);
    List<ProductDto> getAllProducts();
}
