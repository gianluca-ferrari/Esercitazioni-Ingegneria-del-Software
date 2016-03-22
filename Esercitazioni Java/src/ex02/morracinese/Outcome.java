package ex02.morracinese;

public enum Outcome {
	WINNER("Hai vinto!"), LOSER("Hai perso!"), DRAW("Pareggio!");
	
	private final String message;
	
	private Outcome(String message){
		this.message=message;
	}
	
	//override
	public String toString() {
		return message;
	}
	

}
