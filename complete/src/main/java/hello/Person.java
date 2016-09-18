package hello;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.*;
import java.util.*;
import hello.EndPoint;

public class Person {

	@Id private String id;

	private String userName;
	private String firstName;
	private String lastName;
	private List<EndPoint> services;

	public String getUserName() {
	    return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
    public List<EndPoint> getServices() {
        return this.services;
    }

    public void setServices(List<EndPoint> services) {
        this.services = services;
    }
	
}
