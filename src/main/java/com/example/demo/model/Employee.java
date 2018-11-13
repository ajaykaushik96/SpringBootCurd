package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Table")
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column(name="Emp_No")
		private String empNo;
@Column(name="Emp_Name")
		private String empName;
@Column(name="Emp_Position")
		private String position;
		
		public String getEmpNo() 
		{
			return empNo;
		}
		
		
		public void setEmpNo(String empNo) 
		{
			this.empNo = empNo;
		}
		
		public String getEmpName() 
		{
			return empName;
			
		}
		public void setEmpName(String empName) 
		{
			this.empName = empName;
		}
		
		
		public String getPosition() 
		{
			return position;
		}
		
		public void setPosition(String position) 
		{
			this.position = position;
		}
		


}
