package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
public class Contact extends Model {

	@Id
	@GeneratedValue
	public String id;
	public String name;
	public String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static Finder<String, Contact> finder = new Finder<String, Contact>(Contact.class);

}
