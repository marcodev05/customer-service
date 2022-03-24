package com.tsk.customerservice.services;

import java.util.List;

import com.tsk.customerservice.dto.CustomerRequestDTO;
import com.tsk.customerservice.dto.CustomerResponseDTO;

public interface CustomerService {
	
	CustomerResponseDTO create(CustomerRequestDTO customerRequestDTO);
	
	CustomerResponseDTO getById(String id);
	
	List<CustomerResponseDTO> getAll();
	
	

}
