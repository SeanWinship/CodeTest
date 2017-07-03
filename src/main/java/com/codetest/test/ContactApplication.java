package com.codetest.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
		
		//Test Data
		ContactRequestService crs = new ContactRequestService();
		crs.addContactRequest(new ContactRequestModel("Alice", "alice@example.com", "Please Phone Me",false,false));
		crs.addContactRequest(new ContactRequestModel("Bob", "bob@example.com", "Please Email Me",false,false));
		crs.addContactRequest(new ContactRequestModel("Hacker", "hacker@example.com", "<script type='text/javascript'>alert('XSS!')</script>",false,false));
	}
}
