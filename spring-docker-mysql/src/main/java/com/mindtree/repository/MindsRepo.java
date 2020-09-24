package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.MindtreeMinds;

public interface MindsRepo extends JpaRepository<MindtreeMinds, Long> {

	
	
}
