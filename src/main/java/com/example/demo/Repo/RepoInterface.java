package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

	public interface RepoInterface extends JpaRepository<Employee, Long>
	{
		
	}
