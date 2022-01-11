package chapter_34_java_database_programming;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class StaffTable extends Application
{
    private PreparedStatement selectRecord;
    private PreparedStatement addRecord;
    private PreparedStatement updateRecord;
    private TextField tfID = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfFirstName = new TextField();
    private TextField tfMI = new TextField();
    private TextField tfAddress = new TextField();
    private TextField tfCity = new TextField();
    private TextField tfState = new TextField();
    private TextField tfTelephone = new TextField();
    private TextField tfEmail = new TextField();
    private Label lblStatus = new Label();

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Initialize database connection and create a Statement object
        initializeDB();

        Button btView = new Button("View");
        Button btInsert = new Button("Insert");
        Button btUpdate = new Button("Update");
        Button btClear = new Button("Clear");
        HBox buttonBox = new HBox(5);
        buttonBox.getChildren().addAll(btView, btInsert, btUpdate, btClear);
        buttonBox.alignmentProperty().setValue(Pos.CENTER);

        HBox nameBox = new HBox(5);
        nameBox.getChildren()
               .addAll(new Label("Last Name"), tfLastName, new Label("First Name"), tfFirstName, new Label("MI"), tfMI);

        HBox cityStateBox = new HBox(5);
        cityStateBox.getChildren().addAll(new Label("City"), tfCity, new Label("State"), tfState);

        HBox idBox = new HBox(5);
        idBox.getChildren().addAll(new Label("ID"), tfID);

        HBox addressBox = new HBox(5);
        addressBox.getChildren().addAll(new Label("Address"), tfAddress);

        HBox telephoneEmailBox = new HBox(5);
        telephoneEmailBox.getChildren().addAll(new Label("Telephone"), tfTelephone);

        HBox emailBox = new HBox(5);
        emailBox.getChildren().addAll(new Label("Email"), tfEmail);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(lblStatus, idBox, nameBox, addressBox, cityStateBox, telephoneEmailBox, emailBox, buttonBox);
        vBox.setPadding(new Insets(10, 30, 30, 30));

        tfID.setPrefColumnCount(9);
        tfLastName.setPrefColumnCount(15);
        tfFirstName.setPrefColumnCount(15);
        tfMI.setPrefColumnCount(1);
        tfAddress.setPrefColumnCount(20);
        tfCity.setPrefColumnCount(20);
        tfState.setPrefColumnCount(2);
        tfTelephone.setPrefColumnCount(10);
        tfEmail.setPrefColumnCount(40);

        btView.setOnAction(e -> displayRecord());
        btInsert.setOnAction(e -> newRecord());
        btUpdate.setOnAction(e -> update());
        btClear.setOnAction(e -> clearFields());

        // Create a scene and place it in the Stage
        Scene scene = new Scene(vBox, 650, 300);
        primaryStage.setTitle("Staff Table");
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

            selectRecord = connection.prepareStatement("select * from Staff where id = ?");
            addRecord = connection.prepareStatement("insert into Staff values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            updateRecord = connection.prepareStatement("update Staff set lastName = ?, firstName = ?, mi = ? , address = ?, city = ?, state = ?, telephone = ?, email = ? where id = ?");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private void displayRecord()
    {
        String id = tfID.getText();
        try
        {
            selectRecord.setString(1, id);
            ResultSet rset = selectRecord.executeQuery();

            if (rset.next())
            {
                tfID.setText(rset.getString(1));
                tfLastName.setText(rset.getString(2));
                tfFirstName.setText(rset.getString(3));
                tfMI.setText(rset.getString(4));
                tfAddress.setText(rset.getString(5));
                tfCity.setText(rset.getString(6));
                tfState.setText(rset.getString(7));
                tfTelephone.setText(rset.getString(8));
                tfEmail.setText(rset.getString(9));
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

    private void newRecord()
    {
        String id = tfID.getText();
        String lastName = tfLastName.getText();
        String firstName = tfFirstName.getText();
        String MI = tfMI.getText();
        String address = tfAddress.getText();
        String city = tfCity.getText();
        String state = tfState.getText();
        String telephone = tfTelephone.getText();
        String email = tfEmail.getText();
        try
        {
            addRecord.setString(1, id);
            addRecord.setString(2, lastName);
            addRecord.setString(3, firstName);
            addRecord.setString(4, MI);
            addRecord.setString(5, address);
            addRecord.setString(6, city);
            addRecord.setString(7, state);
            addRecord.setString(8, telephone);
            addRecord.setString(9, email);
            addRecord.executeUpdate();
            lblStatus.setText("Table Updated");
        }
        catch (SQLException exception)
        {
            exception.printStackTrace();
        }
    }

    private void update()
    {
        String lastName = tfLastName.getText();
        String firstName = tfFirstName.getText();
        String MI = tfMI.getText();
        String address = tfAddress.getText();
        String city = tfCity.getText();
        String state = tfState.getText();
        String telephone = tfTelephone.getText();
        String email = tfEmail.getText();
        String id = tfID.getText();
        try
        {
            updateRecord.setString(1, lastName);
            updateRecord.setString(2, firstName);
            updateRecord.setString(3, MI);
            updateRecord.setString(4, address);
            updateRecord.setString(5, city);
            updateRecord.setString(6, state);
            updateRecord.setString(7, telephone);
            updateRecord.setString(8, email);
            updateRecord.setString(9, id);
            updateRecord.executeUpdate();
            lblStatus.setText("Record Updated");
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    private void clearFields()
    {
        tfID.clear();
        tfLastName.clear();
        tfFirstName.clear();
        tfMI.clear();
        tfAddress.clear();
        tfCity.clear();
        tfState.clear();
        tfTelephone.clear();
        tfEmail.clear();
    }
}
