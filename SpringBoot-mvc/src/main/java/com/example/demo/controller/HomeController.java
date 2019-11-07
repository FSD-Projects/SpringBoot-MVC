package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class HomeController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/showForm")
	public String showForm(ModelMap model) {
		model.addAttribute("customer",new Customer());
		return "show-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid@ModelAttribute("customer") Customer customer, BindingResult theResult, ModelMap model) {
		if(theResult.hasErrors()) {
			return "show-form";
		}
		else {
			Customer theCustomer = customerService.saveCustomer(customer);
			model.addAttribute("customer", theCustomer);
			return "process-form";
		}		
	}
}
