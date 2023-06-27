package com.delivery.drone.Controller;


import com.delivery.drone.Dto.OrderDto;
import com.delivery.drone.Service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    IOrderService iOrderService;

    @PostMapping("")
    public  String saveOrder(@RequestBody  OrderDto orderDto){
        return  iOrderService.saveOrder(orderDto);
    }
}
