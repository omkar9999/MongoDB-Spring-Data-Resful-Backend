package hello;

import org.springframework.data.annotation.Id;
import java.util.*;
import hello.EndPoint;

/**
 * Class to hold information about user & 
 * his saved endpoints & databases.
 * @author Omkar
 *
 */
public class User {

	@Id private String id;

	private String userName;
	private String password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
	
}
