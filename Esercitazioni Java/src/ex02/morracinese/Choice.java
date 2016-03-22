package ex02.morracinese;

import java.util.Random;

public enum Choice {
	CARTA, FORBICE, SASSO;
	
	//converte una stringa di testo nella scelta corrispondente
	public static Choice parseInput(String input){
		return Enum.valueOf(Choice.class, input);
		//non sono gestite le eccezioni, le vedremo più avanti
	}
	
	//ottiene una scelta casuale
	public static Choice getRandomChoice(){
		Random random = new Random();
		Choice[] choices = Choice.values();
		return choices[random.nextInt(choices.length)];
	}
	
	public Outcome resultAgaintas(Choice other){
		if(this == other){
			return Outcome.DRAW;			
		}
		switch(this){
		case CARTA:
			return winOutcomeIfIsTrueThat(other==Choice.SASSO);		
		case FORBICE:
			return winOutcomeIfIsTrueThat(other==Choice.CARTA);
		case SASSO:
			return winOutcomeIfIsTrueThat(other==Choice.FORBICE);
		default:
			return null;
		}
		
	}
	
	private Outcome winOutcomeIfIsTrueThat(boolean winner)
	{
		return winner ? Outcome.WINNER : Outcome.LOSER;
		/*same as:
		 * if(winner)
		 * 	  return Outcome.WINNER;
		 * else
		 *    return Outcome.LOSER;
		 */
	}
		

}
