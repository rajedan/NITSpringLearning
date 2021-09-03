package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "author_details")
public class AuthorDetails {

	@Id
	@Column(name = "id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "qualification")
	private String qualification;

	@Column(name = "address")
	private String address;

	@OneToOne(mappedBy = "authorDetails")
	private Author author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Author getAuthor() {
		return author;
	}
}
