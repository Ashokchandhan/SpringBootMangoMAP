package com.app.runner;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Book;
import com.app.repo.BookRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		
		Map<String,String> m1=new HashMap<>();
		m1.put("A","B");
		Properties p1=new Properties();
		p1.put("m1","N1");
		p1.put("m2","N2");
		repo.save(new Book("java","ASHOK",3.33,m1,p1));
		System.out.println("done");
		
	}

}
