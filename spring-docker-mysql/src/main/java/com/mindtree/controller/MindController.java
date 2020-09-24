package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.MindtreeMinds;
import com.mindtree.repository.MindsRepo;

@RestController
@RequestMapping("/mind")
@CrossOrigin
public class MindController {
   
	
	@Autowired
	MindsRepo mindsRepo;
	
	
	@GetMapping("/getmind")
	public List<MindtreeMinds> getMinds() {
		MindtreeMinds mind = new MindtreeMinds();
		mind.setName("Unknown");
		mind.setMid(420420);
		mind.setCtc(20000001);
		mindsRepo.save(mind);
		return mindsRepo.findAll();
	}
	
	
}
