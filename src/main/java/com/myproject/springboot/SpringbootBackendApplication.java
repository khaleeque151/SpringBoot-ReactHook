package com.myproject.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myproject.springboot.model.Employee;
import com.myproject.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Employee employee = new Employee();
//		
//		employee.setFirstName("Yusra");
//		employee.setLastName("Khaleeq");
//		employee.setEmailId("YK@hotmail.com");
//		employeeRepository.save(employee);
//		
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Muhammad");
//		employee1.setLastName("Hamiz-ur-Rahman");
//		employee1.setEmailId("mh@hotmail.com");
//		employeeRepository.save(employee1);
	}

}
