/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okulproje;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author fener
 */
public class FXMLDocumentController implements Initializable {
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleClose(javafx.scene.input.MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void changeScreenButtonClicked(javafx.scene.input.MouseEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("employeeMain.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    
}
