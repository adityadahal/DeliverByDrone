package com.delivery.drone.Controller;
import com.delivery.drone.Dto.ProductDto;
import com.delivery.drone.Model.Product;
import com.delivery.drone.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @PostMapping("")
    Product saveProduct(@RequestBody ProductDto productDto){
    return  iProductService.saveProduct(productDto);
    }
    @GetMapping("")
    List<ProductDto> getAllProducts(){
        return iProductService.getAllProducts();
    }
}
