package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "candidate")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidate_id")
	int candidateId;
	@Column(name = "candidate_name")
	String candidateName;
	
	@ManyToMany
	@JoinTable(name = "course_candidate",
				joinColumns = @JoinColumn(name="candidate_id"),
				inverseJoinColumns = @JoinColumn(name="course_id")
	)
	List<Course> courses;

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course tempCourse) {
		if(courses==null) {
			courses=new ArrayList<Course>();
		}
		courses.add(tempCourse);
	}
}
