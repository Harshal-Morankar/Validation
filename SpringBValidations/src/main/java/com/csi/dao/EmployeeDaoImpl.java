package com.csi.dao;


import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;
    public Employee saveData(Employee employee){
        return employeeRepoImpl.save(employee);
    }
}
