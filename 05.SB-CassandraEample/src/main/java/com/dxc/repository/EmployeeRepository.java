package com.dxc.repository;


import org.springframework.data.cassandra.repository.CassandraRepository;

import com.dxc.entity.Employee;

public interface EmployeeRepository extends CassandraRepository<Employee, Integer>{


	
}
