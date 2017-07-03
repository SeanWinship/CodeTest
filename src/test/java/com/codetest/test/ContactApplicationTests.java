package com.codetest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ContactApplicationTests {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	ContactRequestService mockContactRequestService;

	@Test
	public void contextLoads() {

	}
	
	@Test
	public void addContactRequest() {
		ContactRequestModel contactRequest = new ContactRequestModel("Test", "test@example.com", "Test",false,false);
		ContactRequestService crs = new ContactRequestService();
		int id = crs.addContactRequest(contactRequest);
		assertTrue(id>0);
	}
	
	@Test
	public void addAndRetrieveContactRequest() throws Exception {
		ContactRequestModel contactRequest = new ContactRequestModel("Test 2", "test2@example.com", "Test 2",false,false);
		ContactRequestService crs = new ContactRequestService();
		int id = crs.addContactRequest(contactRequest);
		assertTrue(id>0);
		
		ContactRequestModel contactRequestGet = crs.getContactRequest(id);
		assertNotNull(contactRequestGet);
	}
	
	@Test
	public void addAndRetrieveContactRequestContent() throws Exception {
		ContactRequestModel contactRequest = new ContactRequestModel("Test 3", "test3@example.com", "<script>alert('test')</alert>",false,false);
		ContactRequestService crs = new ContactRequestService();
		int id = crs.addContactRequest(contactRequest);
		assertTrue(id > 0);
		
		ContactRequestModel contactRequestGet = crs.getContactRequest(id);
		assertNotNull(contactRequestGet);
		
		assertEquals(contactRequest.details, "<script>alert('test')</alert>");

	}
	
	@Test
	public void testValidCustomerIP10001() {
		EmployeeService es = new EmployeeService();
		assertTrue(es.isEmployee("10.0.0.1"));
	}
	
	@Test
	public void testValidCustomerIP10002() {
		EmployeeService es = new EmployeeService();
		assertTrue(es.isEmployee("10.0.0.2"));
	}
	
	@Test
	public void testInvalidCustomerIP() {
		EmployeeService es = new EmployeeService();
		assertFalse(es.isEmployee("192.168.1.1"));
	}
	
	@Test
	public void testController() throws Exception {
		
		/*
		 * Only modify below if as a result of re-factoring.  Do not modify the test case.
		 */		
		int beforeId = ContactRequestService.getNextId();		
		mvc.perform(post("/submit").param("name", "name").param("email", "email").param("details", "details")).andExpect(view().name("confirmation"));
		int afterId = ContactRequestService.getNextId();
		
		assertEquals(beforeId,afterId);		
	}

}
