package ex03.student;

public class Grade {
	private final String subject;
	private final int points;
	private final int credits;
	
	//consturctors
	public Grade(String subject, int points, int credits) {
		this.subject = subject;
		this.points = points;
		this.credits = credits;
	}

	//Getters & Setters
	public String getSubject() {
		return subject;
	}
	public int getPoints() {
		return points;
	}
	public int getCredits() {
		return credits;
	}
}
