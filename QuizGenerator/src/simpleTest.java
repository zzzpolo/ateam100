import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class simpleTest {
	public static void main(String[] args) {
		QuestionBank testBank = new QuestionBank();
		try {
			testBank.load("test.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(testBank.questionBank.size());
		System.out.println(testBank.questionBank.get("hash table").get(0).questionText);
	}
}
