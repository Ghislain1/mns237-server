package org.mns237.entity;


import javax.persistence.*;

@Entity
@Table(name = "subscribers")
public class Subscribers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	// variables declearation
	@Column(name = "fName")
	private   String fName;
	@Column(name = "lName")
	private String lName;
	@Column(name = "email")
	private String email;
	@Column(name ="verified")
	private boolean verified;

	//a default constructor
	public Subscribers(){

	}

	// constructor
	public Subscribers(long id, String lName, String fName){
		this.id = id;
		this.lName = lName;
		this.fName = fName;
	}

	// getter and setter
	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}


	public void setfName(String fName){
		this.fName = fName;
	}
	public String getfName(){
		return fName;
	}

	public void setlName(String lName){
		this.lName = lName;
	}

	public String getlName(){
		return lName;
	}

	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}

	public void setVerified(boolean verified){
		this.verified = verified;
	}

	public boolean getVerified(){
		return verified;
	}

}