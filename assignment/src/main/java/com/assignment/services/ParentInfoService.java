package com.assignment.services;

import java.util.List;

import com.assignment.entities.ParentInfo;

public interface ParentInfoService {
	public void saveOneInfo(ParentInfo Parentinfo);

	public List<ParentInfo> getParentinfo();

	public void updateParentOneInfo(ParentInfo ParentInfo);

	public void deleteParentOneInfo(long id);
	}

