/**
 * 
 */
package com.shettar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shettar.entities.Customer;
import com.shettar.entities.CustomerResponse;
import com.shettar.services.CustomerService;

/**
 * @author Pradeep.Shettar
 *
 *         Controller class for adding a new customer.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

	/**
	 * Logger object for logging at class level
	 */
	Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

	/**
	 * customerService object for customer service.
	 */
	@Autowired
	private CustomerService customerService;

	/**
	 * @return the customerService
	 */
	public CustomerService getCustomerService() {
		return customerService;
	}

	/**
	 * @param customerService
	 *            the customerService to set
	 */
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * The controller method creates and stores the customer data if the
	 * customer data is not stored.
	 * 
	 * @param customer
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CustomerResponse createCustomer(@RequestBody Customer customer) {
		LOGGER.debug(
				"Entered createCustomer method of CustomerController class with parameter: " + customer.toString());
		CustomerResponse customerResponse = customerService.createCustomer(customer);
		LOGGER.debug("Exiting createCustomer method of CustomerController class with returning value: "
				+ customerResponse.toString());
		return customerResponse;
	}
}
