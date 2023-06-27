package com.delivery.drone.Controller;


import com.delivery.drone.Dto.OrderDto;
import com.delivery.drone.Model.Order;
import com.delivery.drone.Service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    IOrderService iOrderService;

    @PostMapping("")
    public  String saveOrder(@RequestBody  OrderDto orderDto){
        return  iOrderService.saveOrder(orderDto);
    }

    @GetMapping("")
    public List<Order> getAllOrder(){
        return  iOrderService.getAllOrders();
    }
}
