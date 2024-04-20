package com.mypack;
import java.sql.Date;
import jakarta.persistence.Column;  
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name = "user_form")
public class User {
	@Id
	@Column
	private int uid;
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String gender;
	@Column
	private String password;
	@Column
	private String profession;
	@Column
	private String note;
	@Column
	 private Date birthday;
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	private boolean married;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "User [ User id="+uid+", email=" + email + ", gender=" + 
	        gender + ", password=" + password
				+ ", profession=" + profession + ", note=" + 
	           note + ", birthday=" + birthday + ", married=" + married
				+ "]";
	}


	
}
