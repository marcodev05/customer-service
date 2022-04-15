package com.tsk.customerservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tsk.customerservice.CustomerServiceApplication;
import com.tsk.customerservice.dto.CustomerRequestDTO;
import com.tsk.customerservice.dto.CustomerResponseDTO;
import com.tsk.customerservice.services.CustomerService;

@SpringBootTest(classes = CustomerServiceApplication.class)
public class CustomerServiceTest {
	
	@Autowired
	CustomerService service;
	
	@Test
	public void shouldSaveCustomerSuccessfully() {
		CustomerRequestDTO requestDto = new CustomerRequestDTO();
		requestDto.setfName("James");
		requestDto.setlName("Saint Patrick");
		requestDto.setEmail("j-patrick");
		requestDto.setAddress("Queens");
		CustomerResponseDTO customerSaved = service.create(requestDto);
		assertNotNull(customerSaved);
		assertEquals(requestDto.getfName(), customerSaved.getfName());
		
		
	}
	

}
