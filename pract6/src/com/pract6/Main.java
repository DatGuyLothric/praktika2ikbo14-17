package com.pract6;

public class Main {

	public static void main(String args[]) {
		Student[] students;
		students = new Student[10];
		System.out.println("Students: ");
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student((int)(Math.random()*1000));
			System.out.print(students[i].getIDNumber() + " ");
		}
		sortFunc(students);
		System.out.println("\nSorted students: ");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].getIDNumber() + " ");
		}
	}
	
	public static void sortFunc(Student[] students) {
		
		Student temp;
		for (int i = 0; i < students.length; i++) {
			for (int j = i; j < students.length ; j++) {
				if (students[i].getIDNumber() > students[j].getIDNumber()) {
					temp = students[j];
					students[j] = students[i];
					students[i] = temp;
				}
			}
		}
		
	}
	
}
