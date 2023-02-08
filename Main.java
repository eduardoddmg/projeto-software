import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList();
		List<Teacher> teachers = new ArrayList();
		
		boolean shouldContinue = true;
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome, what do you want?");
			System.out.print("1 - Add student\n"
					+ "2 - Remove student\n"
					+ "3 - Update student\n"
					+ "4 - Add teacher\n"
					+ "5 - Remove teacher\n"
					+ "6 - Update teacher\n"
					+ "7 - Ranking students\n"
					+ "99 - Quit\n");
			
			int choice = scanner.nextInt();
				
			if (choice == 1) {
				
				System.out.print("Type the following:\nName: ");
				String name = scanner.next();
				System.out.println("CPF:");
				String cpf = scanner.next();
				System.out.println("Email:");
				String email = scanner.next();
				System.out.println("Score:");
				int score = scanner.nextInt();
				
				Long id = Long.valueOf(students.size()+1);
				
				Student s = new Student(id, name, cpf, email, score);
				
				if (students.size() == 0) {
					students.add(s);
				} else {
					Student testStudent = students.get(students.size()-1);
					if (testStudent.getScore() > s.getScore()) {
						students.remove(students.size()-1);
						students.add(s);
						students.add(testStudent);
					} else {
						students.add(s);
					}
				}
				
				
				System.out.println("New student created with success!" + s);
				
			} else if (choice == 2) {
				
				System.out.println("Registered students: ");
				for(Student student: students) {
					System.out.println(student);
				}
				System.out.println("Type the id of the student that you want remove: ");
				long id = scanner.nextLong();
				
				for (int i = 0; i < students.size(); i++) {
					if (students.get(i).getId() == id) {
						students.remove(students.get(i));
					}
				}
				
				/*
				 * for(Student student: students) { if (student.getId() == id) {
				 * students.remove(student); } }
				 */
				
				System.out.println("Student removed with success!");
				
			} else if (choice == 3) {
				
				System.out.println("Registered students: ");
				for(Student student: students) {
					System.out.println(student);
				}
				System.out.println("Type the id of the student that you want update: ");
				long id = scanner.nextLong();
				
				
				//TODO Correct this, warning!
				//Initialize student with the first student of the list 
				Student studentUpdate = students.get(0);
				
				for(Student student: students) {
					if (student.getId() == id) {
						studentUpdate = student;
					}
				}
				
				System.out.println("What do you want update?\n"
						+ "1 - Name\n"
						+ "2 - CPF\n"
						+ "3 - Email\n");
				int choiceMenu = scanner.nextInt();
				String strUp = scanner.next();
				
				if (choiceMenu == 1) {
					studentUpdate.setName(strUp);
				} else if (choiceMenu == 2) {
					studentUpdate.setCpf(strUp);
				} else if (choiceMenu == 3) {
					studentUpdate.setEmail(strUp);
				}
				
				System.out.println("Student updated with success!");
				
			} else if (choice == 4) {
				
				System.out.print("Type the following:\nName: ");
				String name = scanner.next();
				System.out.println("CPF:");
				String cpf = scanner.next();
				System.out.println("Email:");
				String email = scanner.next();
				
				Long id = Long.valueOf(students.size()+1);
				
				
				Teacher t = new Teacher(id,name, cpf, email);
				teachers.add(t);
				
				System.out.println("New teacher created with success!" + t);
				
			} else if (choice == 5) {
				
				System.out.println("Registered teachers:");
				for(Teacher teacher: teachers) {
					System.out.println(teacher);
				}
				System.out.println("Type the id of the teacher that you want remove: ");
				long id = scanner.nextLong();
			
				
				for (int i = 0; i < teachers.size(); i++) {
					if (teachers.get(i).getId() == id) {
						teachers.remove(teachers.get(i));
					}
				}
				
				System.out.println("Teacher removed with success!");
				
			} else if (choice == 6) {
				System.out.println("Registered teachers:");
				for(Teacher teacher: teachers) {
					System.out.println(teacher);
				}
				System.out.println("Type the id of the teacher that you want update: ");
				long id = scanner.nextLong();
				id -= 1;
				
				Teacher updateTeacher = teachers.get(0);
				for(Teacher teacher: teachers) {
					if (teacher.getId() == id) {
						updateTeacher = teacher;
					}
				}
				
				System.out.println("What do you want update?\n"
						+ "1 - Name\n"
						+ "2 - CPF\n"
						+ "3 - Email\n");
				
				int choiceMenu = scanner.nextInt();
				String strUp = scanner.next();
				
				if (choiceMenu == 1) {
					updateTeacher.setName(strUp);
				} else if (choiceMenu == 2) {
					updateTeacher.setCpf(strUp);
				} else if (choiceMenu == 3) {
					updateTeacher.setEmail(strUp);
				}
				
				System.out.println("Teacher updated with success!");
				
			} else if (choice == 7) {
				System.out.println("Thats the ranking of the students biased on their score: ");
				
				int rank = 1;
				for (int i = students.size()-1; i >= 0; i--) {
					System.out.println(rank + " - " + students.get(i).getName() + " with score -> " + students.get(i).getScore());
					rank++;
				}
			}
			else if (choice == 99) {
				System.out.println("EXIT!");
				shouldContinue = false;
			}
			
		} while(shouldContinue);
		
	}

}
