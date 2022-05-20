package in.me.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.me.entity.Contact;
import in.me.repository.ContactRepository;

@Service
public class ContactServiceimpl implements ContactService {
	
	@Autowired
	private ContactRepository repo;
	
	@Override
	public String upsert(Contact contact) {
		contact.setActiveSw("Y");
		Contact save=repo.save(contact);
		return save+"Success";
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact>findById=repo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		
		//repo.deleteById(cid);
		
		Optional<Contact>findById=repo.findById(cid);
		if(findById.isPresent()) {
			Contact contact=findById.get();
			contact.setActiveSw("N");
			repo.save(contact);
			
		}
		return "Success";
			
	}

}
