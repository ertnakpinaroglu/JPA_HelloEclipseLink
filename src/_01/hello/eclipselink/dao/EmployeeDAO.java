/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01.hello.eclipselink.dao;

import _01.hello.eclipselink.model.Employee;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface EmployeeDAO {
    
    // Employee eklemek için 
    public Employee insertEmployee(int id,String name,String surname,int salary);
    // Employee dondurmek için
    public List<Employee> listEmployee();
    // Employee bulmak için metod 
    public Employee findEmployee(int id);
    // Employee silmek için
    public void removeEmployee(int id);
    // maaşına zam yapmak için gerekli metod
    public Employee raiseSalary(int id,int salary);
    
    
    
    
    
    
    
}
