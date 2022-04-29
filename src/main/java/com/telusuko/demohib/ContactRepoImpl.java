package com.telusuko.demohib;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface ContactRepoImpl extends JpaRepository<Contact,Integer> {

    @Query(value = "SELECT c FROM Contact c where c.id = ?1")
    List<Contact> findALlusers(Integer i) ;
}
