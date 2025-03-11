package com.java.EmployeeMangement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }


    public List<EmployeeEntity> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void saveEmployee(EmployeeEntity employee){
        this.employeeRepository.save(employee);
    }

    public EmployeeEntity getEmployeeById(long id){
        Optional<EmployeeEntity> optional = employeeRepository.findById(id);

        EmployeeEntity employee = null;

        if (optional.isPresent()){
            employee=optional.get();
        }else{
            throw new RuntimeException("Employee not found for id :: "+id);
        }
        return employee;
    }

    public void deleteEmployeeById(long id){
        employeeRepository.deleteById(id);
    }

    public Page<EmployeeEntity> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection){

        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending():
                Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.employeeRepository.findAll(pageable);
    }
}
