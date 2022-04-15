package com.tsk.customerservice.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsk.customerservice.dto.CustomerRequestDTO;
import com.tsk.customerservice.dto.CustomerResponseDTO;
import com.tsk.customerservice.services.CustomerService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class CustomerAPI {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/customers")
	public ResponseEntity<List<CustomerResponseDTO>> allCustomers(){
		List<CustomerResponseDTO> responses = customerService.getAll();
		return new ResponseEntity<>(responses, HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<CustomerResponseDTO> customersById(@PathVariable String id){
		CustomerResponseDTO response = customerService.getById(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	
	
	
	@PostMapping("customers")
	public ResponseEntity<CustomerResponseDTO>  create(@Valid @RequestBody CustomerRequestDTO request) {
		CustomerResponseDTO response = customerService.create(request);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	
	
	 
	@PutMapping("customers/{id}")
	public ResponseEntity<CustomerResponseDTO>  update(@Valid @RequestBody CustomerRequestDTO request,@PathVariable String id) {
		CustomerResponseDTO response = customerService.update(id,request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("customers/delete/{id}")
	public Map<String, Boolean> deleteProduct(@PathVariable("id") String id) {
		customerService.delete(id);
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("delete", Boolean.TRUE);
		return response;
	}


}
