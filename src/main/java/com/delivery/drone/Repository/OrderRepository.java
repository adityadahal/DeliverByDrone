package com.delivery.drone.Repository;


import com.delivery.drone.Model.Customer;
import com.delivery.drone.Model.Order;
import com.delivery.drone.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    Customer findByCustomerId(int customerId);

    Product findByProductId(int productId);
}
