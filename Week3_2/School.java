package Week3_2;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		// ClassRoomList
		Classroom class10a1 = new Classroom(1, "10A1", 3);
		Classroom class10a2 = new Classroom(2, "10A2", 3);
		Classroom class10a3 = new Classroom(3, "10A2", 3);
		Classroom class11a1 = new Classroom(4, "11A1", 2);
		Classroom class11a2 = new Classroom(5, "11A2", 2);
		Classroom class11a3 = new Classroom(6, "11A3", 2);
		Classroom class12a1 = new Classroom(7, "12A1", 1);
		Classroom class12a2 = new Classroom(8, "12A2", 1);
		Classroom class12a3 = new Classroom(9, "12A3", 1);

		// TeacherList
		Teacher alpha = new Teacher(1, "Alpha");
		Teacher beta = new Teacher(2, "Beta");
		Teacher charlie = new Teacher(3, "Charlie");
		Teacher delta = new Teacher(4, "Delta");
		Teacher echo = new Teacher(5, "Echo");
		Teacher foxtrot = new Teacher(6, "Foxtrot");
		Teacher gamma = new Teacher(7, "Gamma");
		Teacher newton = new Teacher(8, "Newton");
		Teacher viktor = new Teacher(9, "Viktor");

		// SubjectList
		Subject math = new Subject(1, "Math");
		Subject literature = new Subject(1, "Literature");
		Subject english = new Subject(1, "English");
		Subject history = new Subject(1, "History");
		Subject geography = new Subject(1, "Geography");
		Subject physics = new Subject(1, "Physcis");
		Subject pe = new Subject(1, "PE");
		Subject biology = new Subject(1, "Biology");
		Subject chemistry = new Subject(1, "Chemistry");

		// StudentList
		Student quang = new Student("Quang");

		ReportCard quangMath = new ReportCard(math, 6);
		ReportCard quangLiterature = new ReportCard(literature, 3);
		ReportCard quangEnglish = new ReportCard(english, 5.5);
		ReportCard quangHistory = new ReportCard(history, 8);
		ReportCard quangGeography = new ReportCard(geography, 7.2);
		ReportCard quangPhysics = new ReportCard(physics, 2.2);
		ReportCard quangPE = new ReportCard(pe, 4);
		ReportCard quangBiology = new ReportCard(biology, 3.4);
		ReportCard quangChemistry = new ReportCard(chemistry, 8);

		ReportCard quangMath2 = new ReportCard(math, 5);
		ReportCard quangLiterature2 = new ReportCard(literature, 6);
		ReportCard quangEnglish2 = new ReportCard(english, 7);
		ReportCard quangHistory2 = new ReportCard(history, 8);
		ReportCard quangGeography2 = new ReportCard(geography, 5.5);
		ReportCard quangPhysics2 = new ReportCard(physics, 7.3);
		ReportCard quangPE2 = new ReportCard(pe, 4);
		ReportCard quangBiology2 = new ReportCard(biology, 5.2);
		ReportCard quangChemistry2 = new ReportCard(chemistry, 8);

		ReportCard[] quangReportCardSemesester1 = { quangMath, quangLiterature, quangEnglish, quangHistory,
				quangGeography, quangPhysics, quangPE, quangBiology, quangChemistry };

		ReportCard[] quangReportCardSemesester2 = { quangMath2, quangLiterature2, quangEnglish2, quangHistory2,
				quangGeography2, quangPhysics2, quangPE2, quangBiology2, quangChemistry2 };

		quang.setReportCardSemester1(quangReportCardSemesester1);
		quang.setReportCardSemester2(quangReportCardSemesester2);

		Student thu = new Student("Thu");

		ReportCard thuMath = new ReportCard(math, 8);
		ReportCard thuLiterature = new ReportCard(literature, 9);
		ReportCard thuEnglish = new ReportCard(english, 9);
		ReportCard thuHistory = new ReportCard(history, 5);
		ReportCard thuGeography = new ReportCard(geography, 10);
		ReportCard thuPhysics = new ReportCard(physics, 9);
		ReportCard thuPE = new ReportCard(pe, 5);
		ReportCard thuBiology = new ReportCard(biology, 9.5);
		ReportCard thuChemistry = new ReportCard(chemistry, 5);

		ReportCard thuMath2 = new ReportCard(math, 9);
		ReportCard thuLiterature2 = new ReportCard(literature, 8.5);
		ReportCard thuEnglish2 = new ReportCard(english, 10);
		ReportCard thuHistory2 = new ReportCard(history, 5);
		ReportCard thuGeography2 = new ReportCard(geography, 9);
		ReportCard thuPhysics2 = new ReportCard(physics, 6);
		ReportCard thuPE2 = new ReportCard(pe, 7);
		ReportCard thuBiology2 = new ReportCard(biology, 8.8);
		ReportCard thuChemistry2 = new ReportCard(chemistry, 4.5);

		ReportCard[] thuReportCardSemesester1 = { thuMath, thuLiterature, thuEnglish, thuHistory, thuGeography,
				thuPhysics, thuPE, thuBiology, thuChemistry };

		ReportCard[] thuReportCardSemesester2 = { thuMath2, thuLiterature2, thuEnglish2, thuHistory2, thuGeography2,
				thuPhysics2, thuPE2, thuBiology2, thuChemistry2 };

		thu.setReportCardSemester1(thuReportCardSemesester1);
		thu.setReportCardSemester2(thuReportCardSemesester2);

		// Object Lists

		Classroom[] classroomList = { class10a1, class10a2, class10a3, class11a1, class11a2, class11a3, class12a1,
				class12a2, class12a3 };

		Subject[] subjectList = { math, literature, english, history, geography, physics, pe, biology, chemistry };

		Teacher[] teacherList = { alpha, beta, charlie, delta, echo, foxtrot, gamma, newton, viktor };

		Student[] studentList = { quang, thu };

		// Assign Teacher To classroom and vice versa
		for (int i = 0; i < classroomList.length; i++) {
			classroomList[i].setTeacher(teacherList[i]);
		}

		for (int i = 0; i < teacherList.length; i++) {
			teacherList[i].setClassroom(classroomList[i]);
		}

		// Assign Teacher To subject and vice versa

		for (int i = 0; i < subjectList.length; i++) {
			subjectList[i].setTeacher(teacherList[i]);
		}

		for (int i = 0; i < teacherList.length; i++) {
			teacherList[i].setSubject(subjectList[i]);
		}

		// Assign Student to Classroom
		quang.setClassroom(class12a3);
		thu.setClassroom(class12a1);

		System.out.println("Welcome to Coding School! How can we help you");
		System.out.println("Input 1 to list all of the current classrooms.");
		System.out.println("Input 2 to list all of the current teachers.");
		System.out.println("Input 3 to list all of the current subjects.");
		System.out.println("Input 4 to list all of the current students.");
		System.out.println("Input 5 to list the report card of a specific student.");
		System.out.println();
		System.out.print("Please Input a Number: ");
		userInput = sc.nextInt();
		switch (userInput) {
		case 1:
			for (int i = 0; i < classroomList.length; i++) {
				System.out.println(classroomList[i].toString());
			}
			break;

		case 2:
			for (int i = 0; i < teacherList.length; i++) {
				System.out.println(teacherList[i].toString());
			}
			break;

		case 3:
			for (int i = 0; i < subjectList.length; i++) {
				System.out.println(subjectList[i].toString());
			}
			break;

		case 4:
			for (int i = 0; i < studentList.length; i++) {
				System.out.println(studentList[i].toString());
			}
			break;

		case 5:
			System.out.print("Please Enter student name: ");
			String userInputStudentName = sc.next();

			for (int i = 0; i < studentList.length; i++) {
				if (userInputStudentName.equals(studentList[i].getName())) {
					double total = 0;
					// double average = total / 12;
					ReportCard[] currentReportCardSemester1 = studentList[i].getReportCardSemester1();
					ReportCard[] currentReportCardSemester2 = studentList[i].getReportCardSemester2();

					System.out.println(" _________________________");
					System.out.println("|                         |");

					System.out.print("|  ");

					String reportCardHeader = studentList[i].getName() + " Report Card";
					int nameLength = 22 - reportCardHeader.length();
					System.out.print(studentList[i].getName() + " Report Card");
					for (int k = 0; k <= nameLength; k++) {
						System.out.print(" ");
					}
					System.out.println("|");
					System.out.println("|                         |");
					System.out.println("|  Semseter 1             |");
					System.out.println("|                         |");

					for (int j = 0; j < currentReportCardSemester1.length; j++) {
						String subjectName = currentReportCardSemester1[j].getSubject().getName() + " ";
						int subjectNamelength = 11 - subjectName.length();
						double subjectGrade = currentReportCardSemester1[j].getGrade();
						int subjectGradelength = 22 - Double.toString(subjectGrade).length() - subjectNamelength
								- subjectName.length();

						System.out.print("| ");
						System.out.print(subjectName);

						for (int k = 0; k <= subjectNamelength; k++) {
							System.out.print(" ");
						}

						System.out.print(subjectGrade);

						for (int k = 0; k <= subjectGradelength; k++) {
							System.out.print(" ");
						}
						System.out.println("|");
					}
					double unroundAverageSem1 = studentList[i].getAverageSemester(currentReportCardSemester1);
					double averageSem1 = Math.round(unroundAverageSem1 * 100.00) / 100.00;
					System.out.print("| Average     " + averageSem1);
					int averageGradelength = 11 - Double.toString(averageSem1).length();
					for (int k = 0; k <= averageGradelength; k++) {
						System.out.print(" ");
					}
					System.out.println("|");

					System.out.println("|                         |");
					System.out.println("|  Semseter 2             |");
					System.out.println("|                         |");

					for (int j = 0; j < currentReportCardSemester2.length; j++) {
						String subjectName = currentReportCardSemester2[j].getSubject().getName() + " ";
						int subjectNamelength = 11 - subjectName.length();
						double subjectGrade = currentReportCardSemester2[j].getGrade();
						int subjectGradelength = 22 - Double.toString(subjectGrade).length() - subjectNamelength
								- subjectName.length();

						System.out.print("| ");
						System.out.print(subjectName);

						for (int k = 0; k <= subjectNamelength; k++) {
							System.out.print(" ");
						}

						System.out.print(subjectGrade);

						for (int k = 0; k <= subjectGradelength; k++) {
							System.out.print(" ");
						}
						System.out.println("|");
					}
					double unroundAverageSem2 = studentList[i].getAverageSemester(currentReportCardSemester2);
					double averageSem2 = Math.round(unroundAverageSem2 * 100.00) / 100.00;
					System.out.print("| Average     " + averageSem2);
					for (int k = 0; k <= averageGradelength; k++) {
						System.out.print(" ");
					}
					System.out.println("|");

					System.out.println("|_________________________|");
					// System.out.println("| Average " + average);

					// System.out.println("Match");
				} else {
					//System.out.println("Cannot find student with that name");
				}
			}
			break;
		}

	}

}