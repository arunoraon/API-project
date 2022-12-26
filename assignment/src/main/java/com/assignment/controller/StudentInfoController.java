package com.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.entities.StudentInfo;
import com.assignment.services.StudentInfoService;

@RestController
@RequestMapping("/api/studentinfo")
public class StudentInfoController {
	@Autowired
	private StudentInfoService studentService;

	@GetMapping
	public List<StudentInfo> getStudentInfo() {
		List<StudentInfo> studentInfo = studentService.getStudentinfo();
		return studentInfo;
	}

	@PostMapping
	public void saveStudentInfo(@RequestBody StudentInfo studentinfo) {
		studentService.saveOneInfo(studentinfo);
	}
	@PutMapping
	public void updateStudentInfo(@RequestBody StudentInfo studentInfo) {
		studentService.updateStudentOneInfo(studentInfo);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudentInfo(@PathVariable("id")long id) {
		studentService.deleteStudentOneInfo(id);
	}
}
