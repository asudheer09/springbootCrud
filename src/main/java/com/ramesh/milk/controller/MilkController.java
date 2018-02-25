package com.ramesh.milk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ramesh.milk.model.Customer;
import com.ramesh.milk.service.CustomerServiceImpl;

@Controller
public class MilkController {
	@Autowired
	private CustomerServiceImpl service;
	
	@RequestMapping("/")
	public String homePage(){
		return "redirect:/all";
	}
	 @RequestMapping(value = "/addCustomers", method = RequestMethod.GET)
	    public ModelAndView showForm() {
	        return new ModelAndView("add", "customer", new Customer());
	    }
	
	@RequestMapping(value="/saveCustomer", method=RequestMethod.POST)
	public String createCustomer(@ModelAttribute("customer")Customer customer){
		service.addCustomer(customer);
		return "success";
	}
	
	@RequestMapping("/editCustomers")
	public String ediPage(){
		return "edit";
	}
	
	@RequestMapping(value="all")
	public ModelAndView getAllCustomers(){
		ModelAndView view= new ModelAndView();
		List<Customer> customers=service.getAllCustomers();
		view.addObject("customers",customers);
		view.setViewName("all");
		return view;
	}
}
