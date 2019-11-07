package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class SpringBootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApplication.class, args);
	}
	
	@Component
	class CustomerCommandLineRunner implements CommandLineRunner {
		@Autowired
		private CustomerService customerService;
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			Customer customer = null;
			customer = new Customer();
			customer.setFirstName("John");
			customer.setLastName("Doe");
			customer.setPhone("9846572345");
			customerService.saveCustomer(customer);
			customer.setFirstName("Kabir");
			customer.setLastName("Singh");
			customer.setPhone("9846143345");
			customerService.saveCustomer(customer);
			customer.setFirstName("Lola");
			customer.setLastName("Bunny");
			customer.setPhone("9846572123");
			customerService.saveCustomer(customer);
		}
		
	}

}
