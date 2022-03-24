package com.tsk.customerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsk.customerservice.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
