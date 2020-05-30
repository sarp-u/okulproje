/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okulproje;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author fener
 */
public class EmployeeDeleteController implements Initializable {

    @FXML private TableView<employeeManagement> tableView;
    @FXML private TableColumn<employeeManagement, String> nameColumn;
    @FXML private TableColumn<employeeManagement, String> surnameColumn;
    @FXML private TableColumn<employeeManagement, String> tcNoColumn;
    @FXML private TableColumn<employeeManagement, String> phoneNoColumn;
    @FXML private TableColumn<employeeManagement, String> mailColumn;
    @FXML private TableColumn<employeeManagement, String> birthdayColumn;
    @FXML private TableColumn<employeeManagement, String> levelColumn;
    @FXML private TextField name;
    
    private ObservableList<employeeManagement> data;
    private dataBase dc;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       dc = new dataBase();
        try {
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            
            ResultSet rs = conn.createStatement().executeQuery("select * from employees");
            while (rs.next()){
                data.add(new employeeManagement(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
            nameColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("name"));
            surnameColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("surname"));
            tcNoColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("tcNo"));
            phoneNoColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("phoneNo"));
            mailColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("mail"));
            birthdayColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("birthday"));
            levelColumn.setCellValueFactory(new PropertyValueFactory<employeeManagement, String> ("level"));
            
            tableView.setItems(null);
            tableView.setItems(data);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeEditController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteButtonPushed() throws SQLException, SQLException, ClassNotFoundException{
        Connection conn = dc.Connect();
        Statement stmt;
        stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM employees WHERE first_name = '" + name.getText() + "';");
        conn.close();
        
        
    }


    @FXML
    private void handleMainScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    
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
    private void handleEmployeeEditScene(MouseEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("employeeEdit.fxml"));
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
