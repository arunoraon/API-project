package com.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entities.ParentInfo;
import com.assignment.repositories.ParentInfoRepository;
@Service
public class ParentInfoServiceImpl implements ParentInfoService {
	@Autowired
	private ParentInfoRepository parentRepo;

	// save date into database
	@Override
	public void saveOneInfo(ParentInfo Parentinfo) {
		parentRepo.save(Parentinfo);
	}
	// get all student info from database
	@Override
	public List<ParentInfo> getParentinfo() {
		List<ParentInfo> Parentinfo = parentRepo.findAll();
		return Parentinfo;
	}
	// update data in database
	@Override
	public void updateParentOneInfo(ParentInfo ParentInfo) {
		parentRepo.save(ParentInfo);
	}
	//delete data from database
	@Override
	public void deleteParentOneInfo(long id) {
		parentRepo.deleteById(id);
	}

}


