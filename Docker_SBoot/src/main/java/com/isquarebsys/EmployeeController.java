package com.isquarebsys;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class EmployeeController
{
    @RequestMapping("/apis/employees")
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"vijay","p","isquarebsys@gmail.com"));
        employeesList.add(new Employee(2,"akshay","a","akshay@gmail.com"));
        return employeesList;
    }
}

