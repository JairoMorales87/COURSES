package com.mx.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.entity.courses;

@Repository
public interface coursesDao extends JpaRepository <courses, Integer>{
	

}
