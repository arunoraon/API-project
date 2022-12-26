package com.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.entities.StudentInfo;

public interface StudentInfoRepository extends JpaRepository<StudentInfo, Long> {

	

}
