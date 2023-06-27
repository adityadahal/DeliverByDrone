package com.delivery.drone.Service;


import com.delivery.drone.Dto.OrderDto;
import com.delivery.drone.Model.Customer;
import com.delivery.drone.Model.Order;
import com.delivery.drone.Model.Product;
import com.delivery.drone.Repository.CustomerRepository;
import com.delivery.drone.Repository.OrderRepository;
import com.delivery.drone.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService implements  IOrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ProductRepository productRepository;


    @Override
    public String saveOrder(OrderDto orderDto) {
        Optional<Customer> customer = customerRepository.findById(orderDto.getCustomer_id());
        Optional<Product> product = productRepository.findById(orderDto.getProduct_id());
        if(customer.isPresent() && product.isPresent()){
            Order order = new Order();
            order.setOrderName(orderDto.getOrderName());
            order.setOrderStatus(orderDto.getOrderStatus());
            order.setProduct(product.get());
            order.setCustomer(customer.get());
             orderRepository.save(order);
             return  "Successfully Placed Order";
        }
        return  "Couldn't Save Order";

    }
}
