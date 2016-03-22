package ex03.student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Student extends Person {
	private static final int GRADUATION_CREDITS = 180;
	
	private final List<Grade> grades = new ArrayList<Grade>(); //lista esami (passed or not)
	
	public Student(String name, Calendar birthday) {
		super(name, birthday); 
	}
	
	public void addGrade(Grade grade){
		if(grade.getPoints()>=18 && grade.getPoints()<=30)
			grades.add(grade);
		else throw new IllegalArgumentException("Grade: points must be between 18 and 30");
	}
	
	public List<Grade> getGrades(){
		return new ArrayList<Grade>(grades);
	}
	
	public boolean canGraduate(){
		if(this.totalCredits()>=Student.GRADUATION_CREDITS)
			return true;
		else
			return false;
	}
	
	public double getWeightedGradeAverage(){
		double wga = 0.0; //Weighted Grade Average
		for(Grade g: grades){
			wga += g.getCredits()*g.getPoints();
		}
		return (wga / this.totalCredits()); 
	}
	
	public int totalCredits(){
		int total = 0;
		for(Grade g: grades){
			total += g.getCredits();
		}
		return total;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", e sono uno studente.";
	}
}
