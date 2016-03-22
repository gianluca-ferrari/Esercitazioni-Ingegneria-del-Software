package ex03.student;

public class Grade {
	private final String subject;
	private final int points;
	private final int credits;
	private final boolean lode;
	
	//Constructors
	public Grade(String subject, int points, int credits, boolean lode) {
		this.subject = subject;
		this.points = points;
		this.credits = credits;
		if(points==30)
			this.lode = lode;
		else
			this.lode = false;
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

	@Override
	public String toString() {
		String buffer = "";
		buffer += "Grade in " + subject + ": " + points;
		if(this.lode)
			buffer += " e Lode";
		buffer += ", " + credits + " cfu.";
		return buffer;
	}
	
	
}
