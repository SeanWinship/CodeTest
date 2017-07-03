package com.codetest.test;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/")
	public String test() {
		return "contact"; 
	}
	
	@RequestMapping("/submit") 
	public String login(@RequestParam(value="name")String name, @RequestParam(value="email")String email,@RequestParam(value="details")String details,Model model) {
		ContactRequestModel crm = new ContactRequestModel(name, email, details,false,false);
		ContactRequestService crs = new ContactRequestService();
		crs.addContactRequest(crm);
		model.addAttribute("contactRequest",crm);
		return "confirmation";
	}
	
	@RequestMapping("/view") 
	public String login(@RequestParam(value="id")int id,Model model) {
		ContactRequestModel contact = null;
		
		ContactRequestService crs = new ContactRequestService();		
		ArrayList<ContactRequestModel> contactRequests = crs.getAllContactRequests();

		for (ContactRequestModel crm : contactRequests ) {
			if (crm.getId() == id) {
				contact = crm;
			}
		}
		
		model.addAttribute("contactRequest",contact);
		
		return "viewRequest";
	}

}