/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okulproje;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author fener
 */
public class EmployeeEditController implements Initializable {

    @FXML private TableView<employeeManagement> tableView;
    @FXML private TableColumn<employeeManagement, String> nameColumn;
    @FXML private TableColumn<employeeManagement, String> surnameColumn;
    @FXML private TableColumn<employeeManagement, String> tcNoColumn;
    @FXML private TableColumn<employeeManagement, String> phoneNoColumn;
    @FXML private TableColumn<employeeManagement, String> mailColumn;
    @FXML private TableColumn<employeeManagement, String> birthdayColumn;
    
    public void changeNameCell(CellEditEvent  editedCell){
        employeeManagement employeeSelected = tableView.getSelectionModel().getSelectedItem();
        employeeSelected.setName(editedCell.getNewValue().toString());
    }
    
    public void changeSurNameCell(CellEditEvent  editedCell){
        employeeManagement employeeSelected = tableView.getSelectionModel().getSelectedItem();
        employeeSelected.setSurname(editedCell.getNewValue().toString());
    }
    
    public void changeTcNoCell(CellEditEvent  editedCell){
        employeeManagement employeeSelected = tableView.getSelectionModel().getSelectedItem();
        employeeSelected.setTcNo(editedCell.getNewValue().toString());
    }
    
    public void changePhoneNoCell(CellEditEvent  editedCell){
        employeeManagement employeeSelected = tableView.getSelectionModel().getSelectedItem();
        employeeSelected.setPhoneNo(editedCell.getNewValue().toString());
    }
    
    public void changeMailCell(CellEditEvent  editedCell){
        employeeManagement employeeSelected = tableView.getSelectionModel().getSelectedItem();
        employeeSelected.setMail(editedCell.getNewValue().toString());
    }
      
    public void changeBirthDayCell(CellEditEvent  editedCell){
        employeeManagement employeeSelected = tableView.getSelectionModel().getSelectedItem();
        employeeSelected.setBirthday(editedCell.getNewValue().toString());
    }
      
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("name"));
        surnameColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("surname"));
        tcNoColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("tcNo"));
        phoneNoColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("phoneNo"));
        mailColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("mail"));
        birthdayColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("birthday"));
        
        //tableView.setItems(getEmployees());
        
        tableView.setEditable(true);
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        surnameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        tcNoColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        phoneNoColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        mailColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        birthdayColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
    }
    /*
    public ObservableList<employeeManagement> getEmployees(){
        ObservableList<employeeManagement> employee = FXCollections.observableArrayList();
        employee.add(new employeeManagement("Ugur","Sarp","28141","0505","e1705","24.05"));
        employee.add(new employeeManagement("Aysu","Aksu","38425","0543","e1705","13.12"));
        employee.add(new employeeManagement("Umut","Yesildal","12345","0512","e1705","11.01"));
        return employee;
    }

    @FXML
    private void handleMainScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    */
       @FXML
    private void handleReportScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("reportMain.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }    


    @FXML
    private void changeScreenButtonClicked(javafx.scene.input.MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("employeeMain.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    
    @FXML
    private void handleEmployeeAddScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("employeeAdd.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }    
    
    @FXML
    private void handleEmployeeDeleteScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("employeeDelete.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void handleEmployeeListScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("employeeList.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void handleClose(MouseEvent event) {
        System.exit(0);
    }
    
}
