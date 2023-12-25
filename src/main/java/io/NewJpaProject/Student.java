package io.NewJpaProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;



@Entity
public class Student {

	@Column(name="Student_name", nullable=false)
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  //auto incrementing primary value ........
	private int rollno;
	
	@OneToOne(fetch = FetchType.LAZY)
	private StudentIDCard  card;
	
	@OneToMany(mappedBy = "student1")
	private List<Course> courseList;
	
	
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public StudentIDCard getCard() {
		return card;
	}
	public void setCard(StudentIDCard card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
}
