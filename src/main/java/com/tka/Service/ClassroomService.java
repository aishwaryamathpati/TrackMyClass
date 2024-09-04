package com.tka.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.Dao.ClassroomDao;
import com.tka.Entity.Classroom;
@Service
public class ClassroomService {
	@Autowired
	ClassroomDao service;
	public 	Classroom InsertData(Classroom classroom ){
		
	
		

	return service.InsertData(classroom);
	
		

	

		
	
	}
	
		
	}

