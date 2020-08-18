/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
/**
 * FXML Controller class
 *
 * @author Tj_0003
 */
public class Assignment5Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
            private TextField txt1;
       @FXML
            private TextField txt2;
       @FXML
            private TextField txt3;
       @FXML
            private TextField txt4;
       @FXML 
            private ComboBox cmb;
       @FXML
            private TextArea txtArea;
       
       
       
      File myfile=new File("test.txt"); 
      
      @FXML
    private void submit(ActionEvent event)
    {
        
         ObservableList<String> lst=FXCollections.observableArrayList();
       
        try
        {
            
           PrintWriter output =  new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode to write data inside file            
           
               
            String course=txt1.getText();
            String Qgrade=txt2.getText();
            String Agrade=txt3.getText();
            String Fgrade=txt4.getText();
            output.println(course+","+Qgrade+","+Agrade+","+Fgrade);
            output.close();
            System.out.println("file created");
            Scanner input=new Scanner(myfile); //open read mode
            if(myfile.exists())
            {
            while(input.hasNext())
            {
                String s=input.next();
                Scanner scn=new Scanner(s);
                scn.useDelimiter(",");
                String n=scn.next();
                lst.addAll(n);
            }
            }
        }
        catch(IOException e)
        {
            System.out.println("error in file write");
        }
        cmb.setItems(lst);
        cmb.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent event)
            {
                txtArea.setText("");
                
         try
             {
                         Scanner input=new Scanner(myfile); //open read mode
             double total=0;
                
              
                         while(input.hasNext())
            {
                         String s=input.next();
               
                         Scanner scn=new Scanner(s);
                         scn.useDelimiter(",");
                         String n1=scn.next();
                         double q=scn.nextDouble();
                        double  a=scn.nextDouble();
                       double  f=scn.nextDouble();
                          for(int i=0;i<lst.size();i++)
                          {
                            if(cmb.getSelectionModel().getSelectedIndex()==i)
                                {
                            if (n1.equals(cmb.getValue()))
                                    {
                                        
                                     total=total+q+a+f;
                             txtArea.appendText(n1+"\t\t"+"quiz"+"\t\t"+"        "+q+"\n"+n1+"\t\t"+"assignment"+"\t"+a+"\n"+n1+"\t\t"+"final"+"\t\t"+"        "+f+"\n\n"+"Total"+"\t\t\t\t" +total+"\n\n");
                                     
                                    }    
                           }
                            
                           
                                
                          }            
            }
                         
                          
                         
                    
                 
            }
                catch(IOException e)
                 {
                System.out.println("error in file read");
                 }
             }
          });
    }
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
