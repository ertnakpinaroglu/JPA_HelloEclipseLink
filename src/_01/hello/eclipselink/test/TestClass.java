
package _01.hello.eclipselink.test;

import _01.hello.eclipselink.dao.EmployeeDAO;
import _01.hello.eclipselink.dao.EmployeeDaoImpl;
import _01.hello.eclipselink.model.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestClass {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceConfig");
        EntityManager entityManager  = emf.createEntityManager();
        
        
        
        
        EmployeeDAO employeeDAO = new EmployeeDaoImpl(entityManager);
        Employee emp1 = employeeDAO.insertEmployee(1, "Ertan", "Akpınaroğlu", 10000);
       Employee emp2 =  employeeDAO.insertEmployee(2, "Yunus", "Ünver", 10000);
         
        
        // eklenilenleri yaz
        System.out.println("Persist: " + emp1);
        System.out.println("Persist: " + emp2);
        
        //
        System.out.println("Find");
        Employee emp = employeeDAO.findEmployee(1);
        System.out.println("1 numaralı kullanıcı " + emp);
        
        // maaş arttırma 
        // 2 numaralı kişinin maaşı arttırıldı
        Employee emp3 = employeeDAO.raiseSalary(2, 500);
        System.out.println("raised: " + emp3);
        
        // 3 numaralı kişiyi sil 
        employeeDAO.removeEmployee(3);
        
        
    }
}
