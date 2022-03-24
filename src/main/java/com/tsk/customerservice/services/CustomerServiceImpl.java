package com.tsk.customerservice.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsk.customerservice.dto.CustomerRequestDTO;
import com.tsk.customerservice.dto.CustomerResponseDTO;
import com.tsk.customerservice.entities.Customer;
import com.tsk.customerservice.exceptions.NotFoundException;
import com.tsk.customerservice.mappers.CustomerMapper;
import com.tsk.customerservice.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	
	private CustomerMapper customerMapper;
	
	

	public CustomerServiceImpl(CustomerRepository customerRepository,CustomerMapper customerMapper) {
		
		this.customerRepository = customerRepository;
		this.customerMapper=customerMapper;
		
	}

	
	
	@Override
	public CustomerResponseDTO create(CustomerRequestDTO customerRequestDTO) {
		
		Customer customer = customerMapper.fromCustomerRequestDTO(customerRequestDTO);
		customer.setId(UUID.randomUUID().toString());
		Customer savedCustomer = customerRepository.save(customer);
		
		return customerMapper.fromCustomer(savedCustomer);
	}

	
	
	
	@Override
	public CustomerResponseDTO getById(String id){
		
		Customer customer = customerRepository.findById(id)
				.orElseThrow(()->new NotFoundException("Not found"));
		return customerMapper.fromCustomer(customer);
	}

	
	
	
	@Override
	public List<CustomerResponseDTO> getAll() {
		List<Customer> customer = customerRepository.findAll();
		
		List<CustomerResponseDTO> response = customer.stream()
												.map((c)-> customerMapper.fromCustomer(c))
												.collect(Collectors.toList());
		
		return response;
	}

}
