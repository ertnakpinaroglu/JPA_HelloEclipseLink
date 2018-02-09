
package _01.hello.eclipselink.dao;

import _01.hello.eclipselink.model.Employee;
import _02.field.access.model.Employee4;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class EmployeeDaoImpl implements EmployeeDAO {

    EntityManager entityManager; // Dependency injection

    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    
    
    @Override
    public Employee insertEmployee(int id, String name, String surname, int salary) {
       Employee eklenecekEmp = new Employee(id, name, surname, salary);
       entityManager.getTransaction().begin();
       entityManager.persist(eklenecekEmp);
       entityManager.getTransaction().commit();
       return eklenecekEmp;
    }

    @Override
    public List<Employee> listEmployee() {
        
        Query query = entityManager.createQuery("select e Employee e");
        return query.getResultList();
    }

    @Override
    public Employee findEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }
    
    

    @Override
    public void removeEmployee(int id) {
        Employee emp = findEmployee(id);
        entityManager.getTransaction().begin();
        entityManager.remove(emp);
        entityManager.getTransaction().commit();
    }

    @Override
    public Employee raiseSalary(int id, int salary) {
        Employee emp = findEmployee(id);
        entityManager.getTransaction().begin();
        emp.setSalary(emp.getSalary()+salary);
        entityManager.getTransaction().commit();
        return emp;
    }
    @Override
    public Employee4 insertEmployee2(Long id, String name, String surname, String mobilephone) {
        Employee4 eklenecekEmp = new Employee4(id, name, surname, mobilephone);
       entityManager.getTransaction().begin();
       entityManager.persist(eklenecekEmp);
       entityManager.getTransaction().commit();
       return eklenecekEmp;
    }

    
    
    
    
    
    
}
