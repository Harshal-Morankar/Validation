package com.csi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {

    @Id
    @GeneratedValue
    private int empId;
    @NotNull
    @Size(min = 2, message = "Employee First Name at least 2 character")
    private String empFirstName;

    @Pattern(regexp="[A-Za-z]*", message="Last name should not contain space and special characters")
    private String empLastName;

    private double empSalary;

    private String empAddress;

    @Email(message = "Email must be valid")
    private String emailId;

    @NotNull
    @Size(min = 4, message = "Password at least 4 character")
    private String empPassword;

}
