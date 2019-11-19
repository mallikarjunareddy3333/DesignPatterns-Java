package com.dp.java;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EmployeeManager {
	
	public List<Employee> employees;
	
	public EmployeeManager() {
		employees = new ArrayList<Employee>();
        this.employees.add(new Employee(1, "John"));
        this.employees.add(new Employee(2, "Michael"));
        this.employees.add(new Employee(3, "Jason"));
	}
	
	public String GetAllEmployees() throws JAXBException {
		String xmlEmployees = jaxbObjectToXML(employees);
		return xmlEmployees;
	}
	
	private String jaxbObjectToXML(List<Employee> employees) throws JAXBException {
		//Create JAXB Context
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		
		//Create Marshaller
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		
		//Required formatting??
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		//Print XML String to Console
		StringWriter sw = new StringWriter();
		
		//Write XML to StringWriter
		jaxbMarshaller.marshal(employees, sw);
		
		//Verify XML Content
        String xmlContent = sw.toString();
        System.out.println( xmlContent );
        
        return xmlContent;
	}
	
}
