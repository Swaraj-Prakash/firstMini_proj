package in.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.me.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
