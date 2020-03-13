package prjSerialization.objectStream;

import java.io.Serializable;
import java.time.LocalDate;


public class Person implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String lastName;
	private LocalDate birthDate;
	private Address address;
	
	public Person(long id, String name, String lastName, LocalDate birthDate) 
	{
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public long getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() 
	{
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) 
	{
		this.birthDate = birthDate;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}
	
	public String toString()
	{
		return String.format("{id %d, name: %s, last name: %s, birth date: %4$te %4$tm %4$tY } ",id,name,lastName,birthDate)
				+ address;
	}

}
