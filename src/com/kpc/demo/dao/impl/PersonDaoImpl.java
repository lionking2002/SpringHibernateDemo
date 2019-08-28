package com.kpc.demo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kpc.demo.dao.PersonDao;
import com.kpc.demo.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao{

	@Autowired
	private SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAllPerson() {
		return sf.getCurrentSession().createQuery("from Person").list();
	}
}
