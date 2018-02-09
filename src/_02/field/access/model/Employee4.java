package _02.field.access.model;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Access(AccessType.FIELD) // field kullansın diye 
public class Employee4 implements Serializable {

    public static String TURKEY_CODE = "+90";
    public static String USA_CODE = "+1";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, surname;

    public Employee4() {
        
    }
    @Transient
    private String mobilephone;
    public Employee4(Long id, String name, String surname, String mobilephone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mobilephone = mobilephone;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

   

    @Access(AccessType.PROPERTY)
    public String getPhoneNumberWithCode() {
        if (mobilephone.startsWith("5")) {
            return TURKEY_CODE + mobilephone;
        } else {
            return USA_CODE + mobilephone;
        }
    }

    public void setPhoneNumberWithCode(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee4)) {
            return false;
        }
        Employee4 other = (Employee4) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee4 [id=" + id + ", name=" + name + ", surname=" + surname + ", mobilephone=" + mobilephone + "]";
    }

}
