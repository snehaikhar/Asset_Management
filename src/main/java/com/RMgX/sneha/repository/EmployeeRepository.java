package com.RMgX.sneha.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RMgX.sneha.Entity.AssetsEntity.Employee;
import com.RMgX.sneha.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long>{

	Object ok();

	Employee saveAll(Employee employee);

	}

