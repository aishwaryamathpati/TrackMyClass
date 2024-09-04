package com.tka.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.Classroom;
import com.tka.Service.ClassroomService;

@RestController
public class ClassroomController {
	@Autowired
	ClassroomService classroomservice;

	@PostMapping("Insert")
	public Classroom InserData(@RequestBody Classroom room) {

		return classroomservice.InsertData(room);

	}

}
