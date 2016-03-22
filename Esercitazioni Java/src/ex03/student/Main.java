package ex03.student;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(1800, 3, 3);
		Person p = new Person("gino", date);
		System.out.println(p.toString());
		p = new Student("pino", date);
		System.out.println(p.toString());
		Student s = (Student)p;
		s.addGrade(new Grade("GAL", 30, 8, false));
		s.addGrade(new Grade("API", 26, 10, true));//26 non può avere la lode, viene ignorata
		String buffer = "";
		buffer += s.toString() + "\n" + "can graduate? " + s.canGraduate() + "\n";
		buffer += "total credits: " + s.totalCredits() + "\n";
		buffer += "weighted average: " + s.getWeightedGradeAverage() + "\n\n";
		System.out.println(buffer + "Grades:\n");
		
		for(Grade g: s.getGrades()){
			System.out.println(g.toString());
		}
		
	}

}
