package com.telusuko.demohib;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class DemohibApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemohibApplication.class, args);


	}

}
