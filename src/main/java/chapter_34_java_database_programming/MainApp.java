package chapter_34_java_database_programming;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;


public class MainApp extends Application
{
    // PreparedStatement for executing queries
    private PreparedStatement preparedStatement;
    private TextField tfSSN = new TextField();
    private TextField tfCourseId = new TextField();
    private Label lblStatus = new Label();

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        // Initialize database connection and create a Statement object
        initializeDB();

        Button btShowGrade = new Button("Show Grade");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("Course ID"), tfCourseId, (btShowGrade));

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox, lblStatus);

        tfSSN.setPrefColumnCount(6);
        tfCourseId.setPrefColumnCount(6);
        btShowGrade.setOnAction(e -> showGrade());

        // Create a scene and place it in the stage
        Scene scene = new Scene(vBox, 420, 80);
        primaryStage.setTitle("FindGrade"); // Set the stage title
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initializeDB()
    {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/javabook", "root",
                                                                "root");
            System.out.println("Database connected");

            String queryString = "select firstName, mi, lastName, title, grade from Student, Enrollment, Course where" +
                                 " Student.ssn = ? and Enrollment.courseId = ? and Enrollment.courseId = Course" +
                                 ".courseId";

            // Create a statement
            preparedStatement = connection.prepareStatement(queryString);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private void showGrade()
    {
        String ssn = tfSSN.getText();
        String courseId = tfCourseId.getText();
        try
        {
            preparedStatement.setString(1, ssn);
            preparedStatement.setString(2, courseId);
            ResultSet rset = preparedStatement.executeQuery();

            if (rset.next())
            {
                String lastName = rset.getString(1);
                String mi = rset.getString(2);
                String firstName = rset.getString(3);
                String title = rset.getString(4);
                String grade = rset.getString(5);

                // Display result in a label
                lblStatus.setText(
                        firstName + " " + mi + " " + lastName + "'s grade on course " + title + " is " + grade);
            }
            else
            {
                lblStatus.setText("Not found");
            }
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}

