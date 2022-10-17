package Week3_2;

import java.sql.Date;

public class Student {

	private int id;
	private String name;
	private Date dob;
	private String address;
	private String phoneNumber;

	private Teacher teacher;
	private Classroom classroom;
	private Subject subject;

	private ReportCard[] reportCardSemester1;
	private ReportCard[] reportCardSemester2;

	public ReportCard[] getReportCardSemester1() {
		return reportCardSemester1;
	}

	public void setReportCardSemester1(ReportCard[] reportCardSemester1) {
		this.reportCardSemester1 = reportCardSemester1;
	}

	public ReportCard[] getReportCardSemester2() {
		return reportCardSemester2;
	}

	public void setReportCardSemester2(ReportCard[] reportCardSemester2) {
		this.reportCardSemester2 = reportCardSemester2;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student name: " + name + ", Primary teacher: " + classroom.getTeacher().getName() + ", Class: "
				+ classroom.getRoomNumber();
	}

	public double getAverageSemester(ReportCard[] reportCardSemester1) {
		double total = 0;
		double average = 0;
		for (int i = 0; i < reportCardSemester1.length; i++) {
			if (reportCardSemester1[i].getSubject().getName().equals("Math")
					|| reportCardSemester1[i].getSubject().getName().equals("Literature")
					|| reportCardSemester1[i].getSubject().getName().equals("English")) {
				total = total + reportCardSemester1[i].getGrade() * 2;
			} else {
				total = total + reportCardSemester1[i].getGrade();
			}
		}

		average = total / 12;
		return average;
	}

}
