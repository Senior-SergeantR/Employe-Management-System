package com.java.EmployeeMangement;

import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    List<EmployeeEntity> getAllEmployees();
    void saveEmployee(EmployeeEntity employee);
    EmployeeEntity getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<EmployeeEntity> findPaginated (int pageNo, int pageSize, String sortField, String sortDirection);

}
