package io.NewJpaProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class StudentIDCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int idCardNumber;
	
	private String softwareVersion;
	
	@OneToOne(mappedBy = "card")
	private Student student;
	
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(int idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	
	
}
