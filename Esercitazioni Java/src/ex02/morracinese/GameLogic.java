package ex02.morracinese;
import java.util.Scanner;

public class GameLogic {
	
	private final Scanner scanner = new Scanner(System.in);
	
	public void round(){
		System.out.println("Fai la tua scelta: CARTA, SASSO o FORBICI?");
		String input = scanner.next();
		Choice playerChoice;
		try {
			playerChoice = Choice.parseInput(input);
		} catch (IllegalArgumentException e) {
			System.out.println("Scelta non valida!");
			return;
		}
		System.out.println("Hai scelto " + playerChoice);
		Choice computerChoice = Choice.getRandomChoice();
		System.out.println("Il computer ha scelto " + computerChoice);
		System.out.println(playerChoice.resultAgaintas(computerChoice).toString());
	}
	
	public void close(){
		this.scanner.close();
	}
	
	
	public static void main(String[] args) {
		GameLogic game = new GameLogic();
		game.round();
		game.round();
		game.round();
		game.round();
		game.round();
		game.close();
	}
}
