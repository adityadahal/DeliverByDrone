package com.delivery.drone.Service;


import com.delivery.drone.Dto.CustomerDto;
import com.delivery.drone.Model.Customer;
import com.delivery.drone.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements  ICustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerAddress(customerDto.getCustomerAddress());
       return customerRepository.save(customer);

    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customerList= customerRepository.findAll();
        List<CustomerDto> customerDtoList = new ArrayList<>();
        for (Customer customer: customerList){
            CustomerDto customerDto = new CustomerDto();
            customerDto.setId(customer.getId());
            customerDto.setCustomerName(customer.getCustomerName());
            customerDto.setCustomerAddress(customer.getCustomerAddress());
            customerDtoList.add(customerDto);
        }
        return customerDtoList;
    }
}
