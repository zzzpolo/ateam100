import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * 
 */

/**
 * @author yujiashi
 *
 */
public class QuestionBank {
	HashMap<String, ArrayList<Question>> questionBank = new HashMap<String, ArrayList<Question>>();
	
	public QuestionBank() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Single add question method
	 * @param question
	 */
	protected void add(Question question) {
		if (!questionBank.containsKey(question.topic)) {
			ArrayList<Question> topicQuestionList = new ArrayList<Question>();
			topicQuestionList.add(question);
			questionBank.put(question.topic, topicQuestionList);
		} else {
			this.questionBank.get(question.topic).add(question);
		}
	}
	
	/**
	 * Method to load json file
	 * @param filePath
	 */
	protected void load(String jsonFilepath) throws FileNotFoundException, IOException, ParseException{
		// create JSON
		Object obj = new JSONParser().parse(new FileReader(jsonFilepath));
		JSONObject jObject = (JSONObject) obj;
		JSONArray questionArray = (JSONArray) jObject.get("questionArray");
		
		for (int i = 0; i < questionArray.size(); i++) {
			JSONObject questionA = (JSONObject) questionArray.get(i);
			String metaData = (String) questionA.get("meta-data");
			System.out.println(metaData);
			String questionText = (String) questionA.get("questionText");
			String topic = (String) questionA.get("topic");
			String image = (String) questionA.get("image");
			ArrayList<Question.Choice> choiceArray = (ArrayList<Question.Choice>) questionA.get("choiceArray");
			Question newQuestion = new Question(metaData, questionText, topic, image, choiceArray);
			this.add(newQuestion);
		}
	}
}
