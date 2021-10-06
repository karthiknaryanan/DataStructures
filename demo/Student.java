package demo;

public class Student implements Comparable<Student> {

	private String studentName;
	private Integer studentId;
	private Integer studentSemester;

	public Student(String studentName, Integer studentId, Integer studentSemester) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentSemester = studentSemester;
	}

	@Override
	public int compareTo(Student student) {
		if(student.getStudentSemester()>this.getStudentSemester())
			return -1;
		else if(student.getStudentSemester().equals(this.getStudentSemester()))
			return 0;
		else
			return 1;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getStudentSemester() {
		return studentSemester;
	}

	public void setStudentSemester(Integer studentSemester) {
		this.studentSemester = studentSemester;
	}

}
