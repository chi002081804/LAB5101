
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OKC
 */
public class Controller {
    
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
    
    private static boolean isValidAge(String str) {
        return str.matches("\\d+");
    }
    
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    
    private boolean isValidName(String name) {
        return !name.trim().isEmpty();
    }
    
    private Alert getAlert(String info) {
        Alert alert = new Alert(AlertType.INFORMATION); 
        alert.setTitle("submitted!");
        alert.setHeaderText("Thank you");
        alert.setContentText(info);
        return alert;
    }
    
    public void submit(ActionEvent event) {

        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        
        if (!isValidName(name)) {
            Alert alert = getAlert("Please enter a valid name.");
            alert.showAndWait();
            return;
        }
        
        if (!isValidAge(age)) {
            Alert alert = getAlert("Please enter a valid age.");
            alert.showAndWait();
            return;
        }
        
        if (!isValidEmail(email)) {
            Alert alert = getAlert("Please enter a valid email.");
            alert.showAndWait();
            return;
        }
        
        String info = "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Email: " + email;
        Alert alert = getAlert(info);
        alert.showAndWait();
    }
}
