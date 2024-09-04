package com.tka.Dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Classroom;

@Repository
public class ClassroomDao {
	@Autowired
	SessionFactory factory;

	public Classroom InsertData(Classroom classroom) {
		System.out.println("I am in dao layer");
		Session session = factory.openSession();

		
		session.save(classroom);
		session.beginTransaction().commit();

		return classroom;

	}

}
