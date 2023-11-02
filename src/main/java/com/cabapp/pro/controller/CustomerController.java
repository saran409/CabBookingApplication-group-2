package com.cabapp.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cabapp.pro.entity.Customer;
import com.cabapp.pro.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	ICustomerService service;

	public CustomerController() {
		 System.out.println("Inside Customer controller");
	}
	
	
	
	
	@PostMapping("/insert/customer")
	public Customer saveCustomer(@RequestBody Customer dto)  {
		 
		Customer savedInfo = service.insertCustomer(dto);
		return savedInfo;
	}
	
	
	
	
	
	@GetMapping("/customerby/{cId}")
	public Customer getCustomerById(@PathVariable int cId)  {
		 
		return service.viewCustomer(cId);
		
	}
	
	
	
	
	
	@GetMapping("/allcustomers") /// www.localhost:5643/customer/allcustomers
	public ResponseEntity<List<Customer>> getAllCustomers() {
		System.out.println("inside controller getCustomers()");
		List<Customer> temp = service.viewCustomers();
		System.err.println(temp.size());
		System.out.println(temp);
		return new ResponseEntity<List<Customer>>(temp, HttpStatus.OK);
	}
	
	
	
	
	
	@GetMapping("/validate")
	public ResponseEntity<Customer> validateCustomer(@RequestParam String userName, @RequestParam String password) {
		Customer savedCustomer = service.validateCustomer(userName, password);
		Customer e = new Customer();
		if (savedCustomer != null) {
			return new ResponseEntity<Customer>(savedCustomer, HttpStatus.OK);
		} else
			return new ResponseEntity<Customer>(e, HttpStatus.NOT_FOUND);
	}
	
	
		
	@PutMapping("/update/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Integer id) {

		return service.updateCustomer(customer, id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public Customer deleteCustomerById(@PathVariable int id) {
		Customer deletedCustomer=service.deleteCustomer(id);
		return deletedCustomer;
	}
		
		
	}
	
	
	
	

