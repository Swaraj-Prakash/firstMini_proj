package in.me.service;

import java.util.List;

import in.me.entity.Contact;

public interface ContactService {
	String upsert(Contact contact);
	List<Contact>getAllContacts();
	Contact getContact(int cid);
	String deleteContact(int cid);
}
