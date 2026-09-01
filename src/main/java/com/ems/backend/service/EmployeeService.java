package com.ems.backend.service;

import com.ems.backend.dto.EmployeeDTO;
import com.ems.backend.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public EmployeeDTO createEmployee(EmployeeDTO employeeDto);
    public EmployeeDTO getEmployeeById(Long employeeId);
    public List<EmployeeDTO> getAllEmployees();
    public EmployeeDTO updateEmployee(Long EmployeeId, EmployeeDTO updatedEmployee);
    public void deleteEmployee(Long employeeId);
}
