package com.ashu.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.enity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
