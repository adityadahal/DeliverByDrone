package com.delivery.drone.Service;


import com.delivery.drone.Dto.OrderDto;
import com.delivery.drone.Model.Order;

import java.util.List;

public interface IOrderService {
   public String saveOrder(OrderDto orderDto);
   public List<Order> getAllOrders();
}
