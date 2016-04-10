import java.util.Map;
import java.util.HashMap;

public class TheMotivator{
	public void prinntMessage(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.printScore(50);
		tm.printMessage(60);
		
	}
	public void printScore(int score){
		System.out.println("Score : "+score);
	}
	public Map<String,Integer> mapStudentScore(int score){
		Map<String, Integer> result = new HashMap<String, Integer>();
		result.put("Test1", score);
		return result;
	}
}
