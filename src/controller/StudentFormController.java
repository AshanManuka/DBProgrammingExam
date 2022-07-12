package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import model.Student;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentFormController implements Initializable {
    public AnchorPane context;
    public JFXTextField studentId;
    public JFXTextField studentName;
    public JFXTextField studentMail;
    public JFXTextField studentContact;
    public JFXTextField studentAddress;
    public JFXTextField studentNIC;
    public JFXButton addBtn;
    public JFXButton updateBtn;
    public JFXButton deleteBtn;
    public JFXTextField searchStudentId;
    public JFXButton searchBtn;

    public void addBtn(ActionEvent actionEvent) {
        String id = studentId.getText();
        String name = studentName.getText();
        String mail = studentMail.getText();
        String contact = studentContact.getText();
        String address = studentAddress.getText();
        String nic = studentNIC.getText();

        Student student = new Student(id,name,mail,contact,address,nic);


    }

    public void updateBtn(ActionEvent actionEvent) {
    }

    public void deleteBtn(ActionEvent actionEvent) {
    }

    public void searchBtn(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
