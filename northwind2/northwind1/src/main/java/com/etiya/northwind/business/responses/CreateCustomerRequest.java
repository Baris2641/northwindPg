package com.etiya.northwind.business.responses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {

	private String customerId;
	private String companyName;
	private String contactName;

}
