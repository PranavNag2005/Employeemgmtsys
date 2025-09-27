package com.example.Employeemgmtsys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employeemgmtsys.model.Employee;
import com.example.Employeemgmtsys.service.Employeeservice;

@RestController
public class EmployeeController {
    @Autowired
    Employeeservice e;

    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/employees")
    public List<Employee> getemployee(){
        return e.employees();
    }
    @PostMapping("/addemployee")
    public void addemployee(@RequestBody  Employee emp){
        System.out.println("hello");
        e.addemployee(emp);
    }
    @PutMapping("/updateemployee")
    public void updateemployee(@RequestBody Employee emp){
        e.updateemployee(emp);
    }

    @DeleteMapping("/deleteemployeebyid/{id}")
    public void  deleteemployeebyid(@PathVariable int id){
        e.deleteemployee(id);
    }

    @GetMapping("/getemployeebyid/{id}")
    public Employee getemployeebyid(@PathVariable int id){
        return e.getemployeebyid(id);
    }
}
