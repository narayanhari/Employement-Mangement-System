/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee_management;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class User {
    private String name;
    private String empno;
    private int access;
    private String dept;
    private String phone;
    private String password;
    private int salary;
    private String designation;
    private ArrayList<String> todo = new ArrayList<String>();
    private int hours;
    private ArrayList<String> messages = new ArrayList<String>();

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ArrayList<String> getTodo() {
        return todo;
    }

    public void setTodo(ArrayList<String> todo) {
        this.todo = todo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", empno=" + empno + ", access=" + access + ", dept=" + dept + ", phone=" + phone + ", password=" + password + ", salary=" + salary + ", designation=" + designation + '}';
    }
    
    
}
