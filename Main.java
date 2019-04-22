package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

public class Main extends Application {
	Stage window;
	Scene start;
	Scene QuizStart;
	Scene AddQuestions;
	Scene LoadQuestions;
	Scene AnswerQuestions;
	Scene Report;

	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();
			Label topLabel = new Label("Quiz Generator v1.0 -- ateam100");
			root.setTop(topLabel);
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// STARTSCENE
			Label welcome = new Label("Welcome to Quiz Generator!");

			// root.setCenter(welcomeArea);
			Button buttonAddQuestionButton = new Button("Add Single Question");
			Button buttonLoadQ = new Button("Load Question");
			Button buttonSave = new Button("Save");
			Button startButton = new Button("Start");
			VBox startBox = new VBox(welcome, buttonAddQuestionButton, buttonLoadQ, buttonSave, startButton);
			startBox.setAlignment(Pos.CENTER);// set Alignment
			startBox.setSpacing(15);// space between
			root.setCenter(startBox);

			// set buttons to the same length
//			buttonAddQuestionButton.setMinWidth(startBox.getPrefWidth());
//			buttonLoadQ.setMinWidth(startBox.getPrefWidth());
//			buttonSave.setMinWidth(startBox.getPrefWidth());
//			startButton.setMinWidth(startBox.getPrefWidth());

			// GENERATEQUIZ
			BorderPane newrootBorderPane = new BorderPane();
			Label generateQuizLabel = new Label("Generate Quiz");
			Label topicLabel = new Label("Topic (MultipleChoice)");
			TextField topicArea = new TextField();
			TextArea topics = new TextArea("TopicA\nTopicB\nTopicC\n");
			TextField quizNum = new TextField();
			Label NumQuiz = new Label("Number of Quiz");
			Button startButton2 = new Button("Start");
			VBox questionBox = new VBox(15, generateQuizLabel, topicLabel, topicArea, topics, NumQuiz, quizNum,
					startButton2);
			questionBox.setAlignment(Pos.CENTER);
			newrootBorderPane.setTop(welcome);
			newrootBorderPane.setLeft(questionBox);
			// questionBox.setSpacing(15);
			// TextArea blankArea = new TextArea();
			// HBox generateBox = new HBox(questionBox,blankArea);

			// questionBox.setMargin(questionBox.getChildren().get(2), 5);
			Scene generateQuiz = new Scene(newrootBorderPane);

			// HBox startQuestion = new HBox();

			// Loadquiz
			Label loadLabel = new Label("Load Json File");
			Label readFileLabel = new Label("Json (File Path)");
			TextField filePathField = new TextField();
			Button loadButton = new Button("Load");
			BorderPane loadPane = new BorderPane();
			loadPane.setTop(welcome);
			loadPane.setCenter(new VBox(loadLabel, readFileLabel, new HBox(filePathField, loadButton)));
			Scene loadQuiz = new Scene(loadPane);
			// action for StartButton1
			startButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					primaryStage.setScene(generateQuiz);
				}
			});

			// action for LoadButton1
			buttonLoadQ.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					primaryStage.setScene(loadQuiz);
				}
			});

			// action for startButton
			startButton2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					primaryStage.setScene(generateQuiz);
				}
			});

		

			// button that needs to be pressed
			// Button button = new Button("Press me and change scene");

			// start
			// Start start = new Start();
			primaryStage.setScene(scene);

			// nextScene
			TextArea textArea = new TextArea("Scene Switched!");
			VBox box = new VBox(textArea);
			start = new Scene(box);

			// scene.addEventFilter(eventType, eventFilter);

			primaryStage.setTitle("QuizGenerator");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sceneStart() {
		Start start = new Start();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
