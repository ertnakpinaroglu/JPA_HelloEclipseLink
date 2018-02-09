package _03.mixed.access.test;

import _01.hello.eclipselink.dao.EmployeeDAO;
import _01.hello.eclipselink.dao.EmployeeDaoImpl;
import _02.field.access.model.Employee4;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestClass {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenceConfig");
        EntityManager entityManager = factory.createEntityManager();

        EmployeeDAO employeeService = new EmployeeDaoImpl(entityManager);

        Employee4 employee = employeeService.insertEmployee2(1L, "Levent", "Erguder", "555 000 00 00");
        Employee4 employee2 = employeeService.insertEmployee2(2L, "James", "Gosling", "200 400 50");
        Employee4 employee3 = employeeService.insertEmployee2(3L, "Joshua", "Bloch", "300 500 70");
        
        
        System.out.println("Persisted " + employee);
         System.out.println("Persisted " + employee2);
          System.out.println("Persisted " + employee3);
    }
}
