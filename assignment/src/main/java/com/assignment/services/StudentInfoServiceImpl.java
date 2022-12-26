package com.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entities.StudentInfo;
import com.assignment.repositories.StudentInfoRepository;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {
	@Autowired
	private StudentInfoRepository studentRepo;

	// save date into database
	@Override
	public void saveOneInfo(StudentInfo studentinfo) {
		studentRepo.save(studentinfo);
	}
	// get all student info from database
	@Override
	public List<StudentInfo> getStudentinfo() {
		List<StudentInfo> studentinfo = studentRepo.findAll();
		return studentinfo;
	}
	// update data in database
	@Override
	public void updateStudentOneInfo(StudentInfo studentInfo) {
		studentRepo.save(studentInfo);
	}
	//delete data from database
	@Override
	public void deleteStudentOneInfo(long id) {
		studentRepo.deleteById(id);
	}

}
