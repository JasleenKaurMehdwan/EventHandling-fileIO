/*
 * Programmer:Jasleen Kaur
 * Date: 31 july,2020
 * Program name: Assignment5
 */
package assignment5;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Assignment5 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //main method
    {
         launch(args);       
    }
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root=FXMLLoader.load(getClass().getResource("Assignment5.fxml"));
        stage.setTitle("Assignment5");
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
