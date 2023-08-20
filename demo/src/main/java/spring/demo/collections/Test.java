package spring.demo.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cconfi.xml");
        // if we have configuration file inside the package, then we need to give the full path to .xml in above command
        // i.e. spring/demo/collections/xml file name.
        Employee emp1 =(Employee) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getContacts());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
    }
}
