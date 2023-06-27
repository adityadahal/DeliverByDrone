package com.delivery.drone.Controller;


import com.delivery.drone.Dto.CustomerDto;
import com.delivery.drone.Model.Customer;
import com.delivery.drone.Service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @PostMapping("")
    public Customer saveCustomer(@RequestBody CustomerDto customerDto) {
        return iCustomerService.saveCustomer(customerDto);
    }

    @GetMapping("")
    public List<CustomerDto> getAllCustomer() {
        return iCustomerService.getAllCustomer();
    }
}
