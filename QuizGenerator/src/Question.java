import java.util.ArrayList;

/**
 * 
 */

/**
 * @author yujiashi
 *
 */
public class Question {

	class Choice{
		boolean isCorrect;
		String choice;
	}
	
	String metaData;
	String questionText;
	String topic;
	String image;
	ArrayList<Choice> choiceArrayList = new ArrayList<Question.Choice>();
	
	public Question(String metaDataString, String questionString, String topicString, String imageString, ArrayList<Choice> choiceArray) {
		this.metaData = metaDataString;
		this.questionText = questionString;
		this.topic = topicString;
		this.image = imageString;
		this.choiceArrayList = choiceArray;
	}
	
	/**
	 * 
	 * @param userChoice
	 * @return
	 */
	protected boolean isCorrect(int userChoice) {
		return choiceArrayList.get(userChoice).isCorrect;
	}
	
	
}
