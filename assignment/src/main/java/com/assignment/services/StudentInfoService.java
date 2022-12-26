package com.assignment.services;

import java.util.List;

import com.assignment.entities.StudentInfo;

public interface StudentInfoService {
public void saveOneInfo(StudentInfo studentinfo);

public List<StudentInfo> getStudentinfo();

public void updateStudentOneInfo(StudentInfo studentInfo);

public void deleteStudentOneInfo(long id);
}
