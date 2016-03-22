package it.polimi.deib.se.ex03.student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 * Rappresentiamo uno studente come una persona cui e' associata
 * una lista di esami.
 */
public class Student extends Person {
	private static final int GRADUATION_CREDITS = 180;
	private final List<Grade> grades = new ArrayList<Grade>();
	
	public List<Grade> getGrades(){
		return new ArrayList<Grade>(grades);
	}

	public Student(String name, Calendar birthday) {
		super(name, birthday);
	}

	// Aggiunge una valutazione alla carriera dello studente.
	public void addGrade(Grade grade) {
		grades.add(grade);
	}

	// Controlla se lo studente ha abbastanza crediti per potersi laureare.
	public boolean canGraduate() {
		return totalCredits() >= GRADUATION_CREDITS;
	}

	// Calcola la media pesata.
	public double getWeightedGradeAverage() {
		int sumOfWeightedPoints = 0;
		for (Grade grade : grades) {
			sumOfWeightedPoints += grade.getCredits() * grade.getPoints();
		}
		return ((double)sumOfWeightedPoints) / totalCredits();
	}

	// Calcola il numero di crediti sostenuti dallo studente.
	private int totalCredits() {
		int totalCredits = 0;
		for (Grade grade : grades) {
			totalCredits += grade.getCredits();
		}
		return totalCredits;
	}

	@Override
	public String toString() {
		return super.toString() + " and I am a student";
	}

}
