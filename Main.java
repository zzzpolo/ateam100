package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
          
			// StartScene
			Label welcomeArea = new Label("Welcome to Quiz Generator!");
			
			//root.setCenter(welcomeArea);
			Button buttonAddQuestionButton = new Button("Add Single Question");
			Button buttonLoadQ = new Button("Load Question");
			Button buttonSave = new Button("Save");
			Button startButton = new Button("Start");
			VBox startBox = new VBox(welcomeArea, buttonAddQuestionButton, buttonLoadQ, buttonSave, startButton);
			welcomeArea.setTextAlignment(TextAlignment.CENTER);
			root.setCenter(startBox);

			
			
			buttonAddQuestionButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					primaryStage.setScene(start);

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
