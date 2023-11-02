package com.cabapp.pro.util;

import com.cabapp.pro.dto.CustomerRequestSubmitDTO;
import com.cabapp.pro.dto.CustomerResponseDTO;
import com.cabapp.pro.entity.Customer;

public class CustomerDTOMapper {
	
	public Customer getAccountFromAccountDTO(CustomerRequestSubmitDTO dto)
	{
		Customer e = new Customer();
		
		e.setUsername(dto.getUsername());
		e.setPassword(dto.getPassword());
		e.setAddress(dto.getAddress());
		e.setMobileNumber(dto.getMobileNumber());
		e.setEmail(dto.getEmail());
		e.setCustomerId(dto.getCustomerId());
	
		return e;
	 
		
	}
	public CustomerResponseDTO getCustomerDTOFromCustomer(Customer customer) {
		CustomerResponseDTO adto = new CustomerResponseDTO();
		ContactInfo c = admin.getContactInfo();
		adto.setCity(c.getCity());
		adto.setCountry(c.getCountry());
		adto.setEmail(c.getEmail());
		adto.setHouseAddress(c.getHouseAddress());
		adto.setPhone(c.getPhone());
		adto.setFullName(admin.getFullName());
		adto.setUserCode(admin.getUserCode());
		adto.setUsername(admin.getUsername());
		adto.setUserrole(admin.getUserrole());
		adto.setPassword(admin.getPassword());
		return adto;
	}

	
	
	

}
