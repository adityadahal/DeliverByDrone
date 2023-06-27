package com.delivery.drone.Service;


import com.delivery.drone.Dto.OrderDto;
import com.delivery.drone.Model.Order;

public interface IOrderService {
   public String saveOrder(OrderDto orderDto);
}
