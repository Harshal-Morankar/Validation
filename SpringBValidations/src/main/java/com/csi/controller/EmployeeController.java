package com.csi.controller;


import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;


    @PostMapping("/saveData")
    public ResponseEntity<Employee> saveData(@Valid @RequestBody Employee employee){
        log.info("#################TRYING TO SAVE DATA FOR EMPLOYEE: "+employee.getEmpFirstName());
        Employee employee1 =employeeServiceImpl.saveData(employee);
        return new ResponseEntity<>(employee1 , HttpStatus.CREATED);
    }
}
