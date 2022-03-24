package com.tsk.customerservice.mappers;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Repository;

import com.tsk.customerservice.dto.CustomerRequestDTO;
import com.tsk.customerservice.dto.CustomerResponseDTO;
import com.tsk.customerservice.entities.Customer;

@Mapper(componentModel = "spring",  unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {
	
	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
	
	public Customer fromCustomerRequestDTO(CustomerRequestDTO customerRequestDTO);
	
	@InheritInverseConfiguration
	public CustomerResponseDTO fromCustomer(Customer customer);

}
