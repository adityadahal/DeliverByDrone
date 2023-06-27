package com.delivery.drone.Controller;

import com.delivery.drone.Dto.DroneDto;
import com.delivery.drone.Service.IDroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DroneController {
    @Autowired
    IDroneService iDroneService;

    @PostMapping("")
    public String flyDroneOrder(@RequestBody DroneDto droneDto){
        return iDroneService.flyDroneWithOrder(droneDto);
    }
}
