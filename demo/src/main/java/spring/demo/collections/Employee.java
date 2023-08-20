package spring.demo.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> contacts;
    private Set<String> addresses;
    private Map<String,String> courses; // name,duration

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
    public Employee(){
        super();
    }
    public Employee(String name, List<String> contacts , Set<String> addresses, Map<String,String> courses){
        super();
        this.name = name;
        this.contacts = contacts;
        this.addresses = addresses;
        this.courses = courses;
    }
}
