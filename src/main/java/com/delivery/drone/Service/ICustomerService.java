package com.delivery.drone.Service;
import com.delivery.drone.Dto.CustomerDto;
import com.delivery.drone.Model.Customer;

import java.util.List;

public interface ICustomerService {
    Customer saveCustomer(CustomerDto customerDto);

   List<CustomerDto> getAllCustomer();
}
