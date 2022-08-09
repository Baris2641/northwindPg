package com.etiya.northwind.api.controllers;

import com.etiya.northwind.business.abstracts.CustomerService;
import com.etiya.northwind.business.responses.CreateCustomerRequest;
import com.etiya.northwind.business.responses.CustomerListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")

public class CustomerController {
	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/getall")
	public List<CustomerListResponse> getAll() {
		return this.customerService.getAlL();

	}

	@GetMapping("/{customerId}")
	public CustomerListResponse getCustomerById(@PathVariable String customerId) {
		return customerService.getCustomerById(customerId);
	}
	
	@PostMapping
	public CustomerListResponse createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest)
	{
		return customerService.createCustomer(createCustomerRequest);
	}
	
}
