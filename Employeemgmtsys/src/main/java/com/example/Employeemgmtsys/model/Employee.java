package com.example.Employeemgmtsys.model;

public class Employee {
    private int eid;
    private String ename;
    private String dept;
    private String salary;
    private String mobileno;

    public Employee(int eid,String ename,String dept,String salary,String mobileno){
        this.eid=eid;
        this.dept=dept;
        this.ename=ename;
        this.salary=salary;
        this.mobileno=mobileno;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
}
