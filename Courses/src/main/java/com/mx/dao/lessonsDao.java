package com.mx.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.entity.lessons;

@Repository
public interface lessonsDao  extends JpaRepository <lessons, Integer>{
	
}
