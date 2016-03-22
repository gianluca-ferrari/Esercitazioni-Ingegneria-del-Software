package ex03.student;
import java.util.Calendar;

public class Person {
	
	private String name;
	private Calendar birthday;
	
	//Constructor
	Person(String name, Calendar birthday){
		this.name=name;
		this.birthday=birthday;
	}

	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + "]";
	}
	
	
}
