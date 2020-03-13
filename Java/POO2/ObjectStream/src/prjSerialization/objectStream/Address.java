package prjSerialization.objectStream;

import java.io.Serializable;

public class Address implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private String street;
	private int number;
	private String complement;
	
	public Address()
	{
		super();
		this.street = null;
		this.number = 0;
		this.complement = null;
	}
	
	public Address(String street, int number, String complement) 
	{
		super();
		this.street = street;
		this.number = number;
		this.complement = complement;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) 
	{
		this.complement = complement;
	}
	
	public String toString()
	{
		return String.format("%s %d (%s)", this.street, this.number, this.complement);
	}

}
