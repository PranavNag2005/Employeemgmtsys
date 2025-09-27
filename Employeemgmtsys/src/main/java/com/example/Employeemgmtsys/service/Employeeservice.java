package com.example.Employeemgmtsys.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Employeemgmtsys.model.Employee;

@Service
public class Employeeservice {
    
    List<Employee>employee=new ArrayList<>(Arrays.asList(new Employee(101, "pranav", "tech", "46897", "7894561330"),new Employee(102, "vamsi", "tech", "78945", "9912117211")));

    public List<Employee> employees(){
        return employee;
    }

    public void addemployee(Employee e) {
     employee.add(e);
    }

    public void updateemployee(Employee emp) {
        int index=0;
        for(int i=0;i<employee.size();i++){
            if(employee.get(i).getEid()==emp.getEid()){
                index=i;
            }
        }
        employee.set(index, emp);
    }
    public void deleteemployee(int id) {
        int index=0;
        for(int i=0;i<employee.size();i++){
            if(employee.get(i).getEid()==id){
                index=i;
            }
        }
        employee.remove(index);
    }

    
   


}
