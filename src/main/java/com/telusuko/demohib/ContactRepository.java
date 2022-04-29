package com.telusuko.demohib;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ContactRepository {
  @Autowired private EntityManager entityManager;


//
//
//    @Transactional
//    public void save(Contact contact) {
//        entityManager.persist(contact);
//    }
//    @Transactional
//    public Contact update(Contact contact) {
//        return entityManager.merge(contact);
//    }

//    @Autowired
//    private EntityManager entityManager;

//
     public List<Contact> findAll() {
        String jpql = "SELECT c FROM Contact c where c.id = :number";
        TypedQuery<Contact> query = entityManager.createQuery(jpql, Contact.class);
        query.setParameter("number",2);
         //List<Contact> resultList = query.getResultList();
         return query.getResultList();

     }

}