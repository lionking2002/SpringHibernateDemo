package com.kpc.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpc.demo.dao.PersonDao;
import com.kpc.demo.model.Person;
import com.kpc.demo.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Override
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}
	
}
