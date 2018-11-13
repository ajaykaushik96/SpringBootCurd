package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.EmpRepository;
import com.example.demo.model.Employee;
@Service
public class EmpService {
	
	@Autowired
	EmpRepository EmpRepo;
	
	public void Display(Employee EmpObj)
	{
		EmpRepo.save(EmpObj);
	}

}
