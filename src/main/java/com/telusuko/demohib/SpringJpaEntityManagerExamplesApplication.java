package com.telusuko.demohib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class SpringJpaEntityManagerExamplesApplication implements CommandLineRunner {

//    @Autowired
//    private ContactRepository repo;
    @Autowired
   private  ContactRepoImpl  contactRepo;
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaEntityManagerExamplesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // code goes here...
        listContacts();
//        createContact();
//        updateContact();
    }
    private void createContact() {
        Contact newContact = new Contact();

        newContact.setName("Peter Smith");
        newContact.setEmail("peter.smith@gmail.com");
        newContact.setAddress("New York, USA");
        newContact.setPhone("123456-2111");

        //repo.save(newContact);
    }

    private void updateContact() {
        Contact existContact = new Contact();

        existContact.setId(1);
        existContact.setName("Peter Smith");
        existContact.setEmail("peter.smith@gmail.com");
        existContact.setAddress("New York, USA");
        existContact.setPhone("123456-2111");

        //Contact updatedContact = repo.update(existContact);

    }

    private void listContacts() {
        List<Contact> listContacts = contactRepo.findALlusers(1);
       // System.out.println(listContacts);
       listContacts.forEach(System.out::println);
    }


}