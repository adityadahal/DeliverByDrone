package com.delivery.drone.Service;

import com.delivery.drone.Dto.DroneDto;
import com.delivery.drone.Enum.OrderStatus;
import com.delivery.drone.Model.Order;
import com.delivery.drone.Repository.DroneRepository;
import com.delivery.drone.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DroneService implements IDroneService {
    @Autowired
    DroneRepository droneRepository;

    @Autowired
    OrderRepository orderRepository;


    @Override
    public String flyDroneWithOrder(DroneDto droneDto) {
        Optional<Order> order = orderRepository.findById(droneDto.getOrderId());
        if(order.isPresent()){
            if(order.get().getOrderStatus() == OrderStatus.PAID){
                return "Drone Took Off Successfully";

            }
            return "Please Pay Your Bills First";
        }

        return "Check Your Order First";
    }
}
