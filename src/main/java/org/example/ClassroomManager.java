package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This class implements the UI for the student and teacher management system.
// You don't need to modify this class.
public class ClassroomManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Student> students = new ArrayList<>();
    private static final List<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println(" Main Menu");
            System.out.println("--------------------------------");
            System.out.println("1. Student Management");
            System.out.println("2. Teacher Management");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                studentManagement();
            } else if (choice.equals("2")) {
                teacherManagement();
            } else if (choice.equals("3")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void studentManagement() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println(" Student Management");
            System.out.println("--------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Add Absence");
            System.out.println("5. Add Bonus Points");
            System.out.println("6. Back");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addStudent();
            } else if (choice.equals("2")) {
                removeStudent();
            } else if (choice.equals("3")) {
                for (Student student : students) {
                    System.out.println(student);
                }
            } else if (choice.equals("4")) {
                System.out.println("Enter student name:");
                String name = scanner.nextLine();

                Student student = findStudent(name);

                if (student == null) {
                    System.out.println("Student not found.");
                } else {
                    student.addAbsence();
                    System.out.println("Absence added successfully!");
                }
            } else if (choice.equals("5")) {
                System.out.println("Enter student name:");
                String name = scanner.nextLine();

                Student student = findStudent(name);

                if (student == null) {
                    System.out.println("Student not found.");
                } else {
                    System.out.println("Enter bonus points:");
                    double bonusPoints = Double.parseDouble(scanner.nextLine());
                    student.addBonusPoints(bonusPoints);
                    System.out.println("Bonus points added successfully!");
                }
            } else if (choice.equals("6")) {
                return;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student grade:");
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter days absent:");
        int daysAbsent = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name, grade, daysAbsent);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    public static void removeStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        Student student = findStudent(name);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            students.remove(student);
            System.out.println("Student removed successfully!");
        }
    }

    public static Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static void teacherManagement() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println(" Teacher Management");
            System.out.println("--------------------------------");
            System.out.println("1. Add Teacher");
            System.out.println("2. Remove Teacher");
            System.out.println("3. Print Teachers");
            System.out.println("4. Back");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addTeacher();
            } else if (choice.equals("2")) {
                removeTeacher();
            } else if (choice.equals("3")) {
                for (Teacher teacher : teachers) {
                    System.out.println(teacher);
                }
            } else if (choice.equals("4")) {
                return;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addTeacher() {
        System.out.println("Enter teacher name:");
        String name = scanner.nextLine();

        System.out.println("Enter class name:");
        String className = scanner.nextLine();

        Teacher teacher = new Teacher(name, className);
        teachers.add(teacher);

        System.out.println("Teacher added successfully!");
    }

    public static void removeTeacher() {
        System.out.println("Enter teacher name:");
        String name = scanner.nextLine();

        Teacher teacher = findTeacher(name);

        if (teacher == null) {
            System.out.println("Teacher not found.");
        } else {
            teachers.remove(teacher);
            System.out.println("Teacher removed successfully!");
        }
    }

    public static Teacher findTeacher(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }
}