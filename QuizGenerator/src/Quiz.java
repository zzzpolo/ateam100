import java.util.ArrayList;

/**
 * 
 * @author yujiashi
 *
 */
public class Quiz {
	ArrayList<Question> quiz;
    int index = 0; // which question is reach during the quiz
    int correctNum = 0; // Correct number of the quiz
    int totalNum = 0; // Total questions inside the quiz
    int option; // 
    
    /**
     * Constructor for the quiz
     * @param totalNum
     */
    public Quiz(int totalNum){
        this.totalNum = totalNum;
    }
    
    /**
     * get Next Question
     * @return
     */
    public int nextQuestion(){
        index++;
        return index;
    }
    
    /**
     * Get the number of question which answer correctly
     * @return
     */
    public int getCorrectAnswerNum(){
        return correctNum;
    }

    /**
     * Get total number of the question inside the question
     * @return
     */
    public int getTotalNum(){
        return totalNum;
    }
    
    /**
     * Get correct Percent of the quiz
     * @return
     */
    public double getPercentCorrect(){
        return correctNum/totalNum;
    }
}
