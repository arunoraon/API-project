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

import com.assignment.entities.ParentInfo;
import com.assignment.services.ParentInfoService;

@RestController
@RequestMapping("/api/parentinfo")
public class ParentInfoController {
	@Autowired
	private ParentInfoService parentService;

	@GetMapping
	public List<ParentInfo> getParentInfo() {
		List<ParentInfo> parentInfo = parentService.getParentinfo();
		return parentInfo;
	}

	@PostMapping
	public void saveParentInfo(@RequestBody ParentInfo parentinfo) {
		parentService.saveOneInfo(parentinfo);
	}
	@PutMapping
	public void updateParentInfo(@RequestBody ParentInfo parentInfo) {
		parentService.updateParentOneInfo(parentInfo);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteParentInfo(@PathVariable("id")long id) {
		parentService.deleteParentOneInfo(id);
	}
}

