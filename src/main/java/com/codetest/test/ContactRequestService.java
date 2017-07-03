package com.codetest.test;

import java.util.ArrayList;

public class ContactRequestService {
	
	private static int nextId = 1;
	
	/**
	 * This is the in memory list of contact requests.  This can remain, all operations can act on this ArrayList or an alternative structure if preferred.
	 */
	private static ArrayList<ContactRequestModel> contactRequests = new ArrayList<ContactRequestModel>();	
	
	/**
	 * Add a Contact Request
	 * 
	 *  @param contactRequest The contact request model to add to the "database"
	 *  @return The ID of the inserted Contact Request
	 */
	public int addContactRequest(ContactRequestModel contactRequest) {
		contactRequest.id = nextId++;
		contactRequests.add(contactRequest);
		return contactRequest.id;
	}
	
	public ContactRequestModel getContactRequest(int id) {
		return null;
	}
	
	public ArrayList<ContactRequestModel> getAllContactRequests() {
		return contactRequests;
	}
	
	public static int getNextId() {
		return nextId;
	}

}
