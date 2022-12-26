package com.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.entities.ParentInfo;

public interface ParentInfoRepository extends JpaRepository<ParentInfo, Long> {
}
