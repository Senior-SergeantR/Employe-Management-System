package com.java.EmployeeMangement.Repository;

import com.java.EmployeeMangement.Model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Long> {
}
