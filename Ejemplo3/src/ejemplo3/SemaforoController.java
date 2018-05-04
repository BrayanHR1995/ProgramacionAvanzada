/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
/**
 * FXML Controller class
 *
 * @author BrayanHR09
 */
public class SemaforoController implements Initializable {
    @FXML
    Label labelnombre;
    @FXML
    BorderPane bp1,bp2,bp3,bp4,bp5,bp6,
            bp7,bp8,bp9,bp10,bp11,
            bp12,bp13,bp14,bp15,bp16,
            bp17,bp18,bp19,bp20,bp21,bp22,
            bp23,bp24,bp25,bp26,bp27,
            bp28,bp29,bp30,bp31,bp32,bp33,
            bp34,bp35,bp36,bp37,bp38,bp39,
            bp40,bp41,bp42,bp43,bp44,
            bp45,bp46,bp47,bp48,bp49,
            bp50,bp51,bp52,bp53;
    @FXML //Titulos
    Label labelt1 ,labelt2,labelt3,labelt4,labelt5,labelvt6,
            labelt7 ,labelt8,labelt9,labelt10,labelt11,
            labelvt12;
    @FXML //Notas
    Label labeln1,labeln2,labeln3,labeln4,labeln5,labeln6,
            labeln7,labeln8,labeln9,labeln10,labeln11,
            labeln12,labeln13,labeln14,labeln15,labeln16,
            labeln17,labeln18,labeln19,labeln20,labeln21,labeln22,
            labeln23,labeln24,labeln25,labeln26,labeln27,labeln28,
            labeln29,labeln30,labeln31,labeln32,labeln33,labeln34,
            labeln35,labeln36,labeln37,labeln38,labeln39,labeln40,
            labeln41,labeln42,labeln43,labeln44,
            labeln45,labeln46,labeln47,labeln48,
            labeln49,labeln50,labeln51,labeln52,labeln53;
    
    @FXML //Veces
    Label labelv1,labelv2,labelv3,labelv4,labelv5,labelv6,
            labelv7,labelv8,labelv9,labelv10,labelv11,
            labelv12,labelv13,labelv14,labelv15,labelv16,
            labelv17,labelv18,labelv19,labelv20,labelv21,labelv22,
            labelv23,labelv24,labelv25,labelv26,labelv27,labelv28,
            labelv29,labelv30,labelv31,labelv32,labelv33,labelv34,
            labelv35,labelv36,labelv37,labelv38,labelv39,labelv40,
            labelv41,labelv42,labelv43,labelv44,
            labelv45,labelv46,labelv47,labelv48,
            labelv49,labelv50,labelv51,labelv52,labelv53;
    @FXML //Titulos
    Label labelc1,labelc2,labelc3,labelc4,labelc5,labelc6,
            labelc7,labelc8,labelc9,labelc10,labelc11,
            labelc12,labelc13,labelc14,labelc15,labelc16,
            labelc17,labelc18,labelc19,labelc20,labelc21,labelc22,
            labelc23,labelc24,labelc25,labelc26,labelc27,labelc28,
            labelc29,labelc30,labelc31,labelc32,labelc33,labelc34,
            labelc35,labelc36,labelc37,labelc38,labelc39,labelc40,
            labelc41,labelc42,labelc43,labelc44,
            labelc45,labelc46,labelc47,labelc48,
            labelc49,labelc50,labelc51,labelc52,labelc53;
    @FXML
    TextField txtfieldcodigo;
    
    static ArrayList<Vector> datos;
    @FXML
    public   void llenar(){


        if(!txtfieldcodigo.getText().equals("")){
            
            Conexion conect = new Conexion();
            datos = conect.consultar(txtfieldcodigo.getText());
            int tam=datos.size();
            System.out.println(tam);
            
            //Reiniciar BorderPane
            bp1.setStyle("-fx-background-color: #dadada" );bp2.setStyle("-fx-background-color: #dadada" );
            bp3.setStyle("-fx-background-color: #dadada" );bp4.setStyle("-fx-background-color: #dadada" );
            bp5.setStyle("-fx-background-color: #dadada" );bp6.setStyle("-fx-background-color: #dadada" );
            bp7.setStyle("-fx-background-color: #dadada" );bp8.setStyle("-fx-background-color: #dadada" );
            bp9.setStyle("-fx-background-color: #dadada" );bp10.setStyle("-fx-background-color: #dadada" );
            bp11.setStyle("-fx-background-color: #dadada" );bp12.setStyle("-fx-background-color: #dadada" );
            bp13.setStyle("-fx-background-color: #dadada" );bp14.setStyle("-fx-background-color: #dadada" );
            bp15.setStyle("-fx-background-color: #dadada" );bp16.setStyle("-fx-background-color: #dadada" );
            bp17.setStyle("-fx-background-color: #dadada" );bp18.setStyle("-fx-background-color: #dadada" );
            bp19.setStyle("-fx-background-color: #dadada" );bp20.setStyle("-fx-background-color: #dadada" );
            bp21.setStyle("-fx-background-color: #dadada" );bp22.setStyle("-fx-background-color: #dadada" );
            bp23.setStyle("-fx-background-color: #dadada" );bp24.setStyle("-fx-background-color: #dadada" );
            bp25.setStyle("-fx-background-color: #dadada" );bp26.setStyle("-fx-background-color: #dadada" );
            bp27.setStyle("-fx-background-color: #dadada" );bp28.setStyle("-fx-background-color: #dadada" );
            bp29.setStyle("-fx-background-color: #dadada" );bp30.setStyle("-fx-background-color: #dadada" );
            bp31.setStyle("-fx-background-color: #dadada" );bp32.setStyle("-fx-background-color: #dadada" );
            bp33.setStyle("-fx-background-color: #dadada" );bp34.setStyle("-fx-background-color: #dadada" );
            bp35.setStyle("-fx-background-color: #dadada" );bp36.setStyle("-fx-background-color: #dadada" );
            bp37.setStyle("-fx-background-color: #dadada" );bp38.setStyle("-fx-background-color: #dadada" );
            bp39.setStyle("-fx-background-color: #dadada" );bp40.setStyle("-fx-background-color: #dadada" );
            bp41.setStyle("-fx-background-color: #dadada" );bp42.setStyle("-fx-background-color: #dadada" );
            bp43.setStyle("-fx-background-color: #dadada" );bp44.setStyle("-fx-background-color: #dadada" );
            bp45.setStyle("-fx-background-color: #dadada" );bp46.setStyle("-fx-background-color: #dadada" );
            bp47.setStyle("-fx-background-color: #dadada" );bp48.setStyle("-fx-background-color: #dadada" );
            bp49.setStyle("-fx-background-color: #dadada" );bp50.setStyle("-fx-background-color: #dadada" );
            bp51.setStyle("-fx-background-color: #dadada" );bp52.setStyle("-fx-background-color: #dadada" );
            bp53.setStyle("-fx-background-color: #dadada" );
            
            //Reiniciar Notas
            labeln1.setText("DEBE");labeln2.setText("DEBE");labeln3.setText("DEBE");labeln4.setText("DEBE");
            labeln5.setText("DEBE");labeln6.setText("DEBE");labeln7.setText("DEBE");labeln8.setText("DEBE");
            labeln9.setText("DEBE");labeln10.setText("DEBE");labeln11.setText("DEBE");labeln12.setText("DEBE");
            labeln13.setText("DEBE");labeln14.setText("DEBE");labeln15.setText("DEBE");labeln16.setText("DEBE");
            labeln17.setText("DEBE");labeln18.setText("DEBE");labeln19.setText("DEBE");labeln20.setText("DEBE");
            labeln21.setText("DEBE");labeln22.setText("DEBE");labeln23.setText("DEBE");labeln24.setText("DEBE");
            labeln25.setText("DEBE");labeln26.setText("DEBE");labeln27.setText("DEBE");labeln28.setText("DEBE");
            labeln29.setText("DEBE");labeln30.setText("DEBE");labeln31.setText("DEBE");labeln32.setText("DEBE");
            labeln33.setText("DEBE");labeln34.setText("DEBE");labeln35.setText("DEBE");labeln36.setText("DEBE");
            labeln37.setText("DEBE");labeln38.setText("DEBE");labeln39.setText("DEBE");labeln40.setText("DEBE");
            labeln45.setText("DEBE");labeln46.setText("DEBE");labeln47.setText("DEBE");labeln48.setText("DEBE");
            labeln49.setText("DEBE");labeln50.setText("DEBE");labeln51.setText("DEBE");labeln52.setText("DEBE");
            labeln53.setText("DEBE");
            
            //Reiniciar Veces
            labelv1.setText("0");labelv2.setText("0");labelv3.setText("0");labelv4.setText("0");
            labelv5.setText("0");labelv6.setText("0");labelv7.setText("0");labelv8.setText("0");
            labelv9.setText("0");labelv10.setText("0");labelv11.setText("0");labelv12.setText("0");
            labelv13.setText("0");labelv14.setText("0");labelv15.setText("0");labelv16.setText("0");
            labelv17.setText("0");labelv18.setText("0");labelv19.setText("0");labelv20.setText("0");
            labelv21.setText("0");labelv22.setText("0");labelv23.setText("0");labelv24.setText("0");
            labelv25.setText("0");labelv26.setText("0");labelv27.setText("0");labelv28.setText("0");
            labelv29.setText("0");labelv30.setText("0");labelv31.setText("0");labelv32.setText("0");
            labelv33.setText("0");labelv34.setText("0");labelv35.setText("0");labelv36.setText("0");
            labelv37.setText("0");labelv38.setText("0");labelv39.setText("0");labelv40.setText("0");
            labelv41.setText("0");labelv42.setText("0");labelv43.setText("0");labelv44.setText("0");
            labelv45.setText("0");labelv46.setText("0");labelv47.setText("0");labelv48.setText("0");
            labelv49.setText("0");labelv50.setText("0");labelv51.setText("0");labelv52.setText("0");
            labelv53.setText("0");
            

            for(int i=0;i<tam;i++){
                labelnombre.setText((String) datos.get(0).get(2));
                if(labelc1.getText().equals((String) datos.get(i).get(1))){
                    labeln1.setText((String) datos.get(i).get(4));
                    labelv1.setText((String) datos.get(i).get(5));
                               
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp1.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp1.setStyle("-fx-background-color: #2fac66" );

                    }
                    
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp1.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc2.getText().equals((String) datos.get(i).get(1))){
                    labeln2.setText((String) datos.get(i).get(4));
                    labelv2.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp2.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp2.setStyle("-fx-background-color: #2fac66" );
                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp2.setStyle("-fx-background-color: #f9b233" );
                    }                  
                }
                
                if(labelc3.getText().equals((String) datos.get(i).get(1))){
                    labeln3.setText((String) datos.get(i).get(4));
                    labelv3.setText((String) datos.get(i).get(5));
                    
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp3.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp3.setStyle("-fx-background-color: #2fac66" );
                    }
                    if (Integer.parseInt(datos.get(i).get(5).toString()) >= 2) {
                        bp3.setStyle("-fx-background-color: #f9b233");
                    }
                }
                
                if(labelc4.getText().equals((String) datos.get(i).get(1))){
                    labeln4.setText((String) datos.get(i).get(4));
                    labelv4.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp4.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp4.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp4.setStyle("-fx-background-color: #f9b233" );
                    }
                }
 
                if(labelc5.getText().equals((String) datos.get(i).get(1))){
                    labeln5.setText((String) datos.get(i).get(4));
                    labelv5.setText((String) datos.get(i).get(5));
                    
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp5.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp5.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp5.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc6.getText().equals((String) datos.get(i).get(1))){
                    labeln6.setText((String) datos.get(i).get(4));
                    labelv6.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp6.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp6.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp6.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc7.getText().equals((String) datos.get(i).get(1))){
                    labeln7.setText((String) datos.get(i).get(4));
                    labelv7.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp7.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp7.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp7.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc8.getText().equals((String) datos.get(i).get(1))){
                    labeln8.setText((String) datos.get(i).get(4));
                    labelv8.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp8.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp8.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp8.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc9.getText().equals((String) datos.get(i).get(1))){
                    labeln9.setText((String) datos.get(i).get(4));
                    labelv9.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp9.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp9.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp9.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc10.getText().equals((String) datos.get(i).get(1))){
                    labeln10.setText((String) datos.get(i).get(4));
                    labelv10.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp10.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp10.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp10.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc11.getText().equals((String) datos.get(i).get(1))){
                    labeln11.setText((String) datos.get(i).get(4));
                    labelv11.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp11.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp11.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp11.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc12.getText().equals((String) datos.get(i).get(1))){
                    labeln12.setText((String) datos.get(i).get(4));
                    labelv12.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp12.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp12.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp12.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc13.getText().equals((String) datos.get(i).get(1))){
                    labeln13.setText((String) datos.get(i).get(4));
                    labelv13.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp13.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp13.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp13.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                
                if(labelc14.getText().equals((String) datos.get(i).get(1))){
                    labeln14.setText((String) datos.get(i).get(4));
                    labelv14.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp14.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp14.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp14.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc15.getText().equals((String) datos.get(i).get(1))){
                    labeln15.setText((String) datos.get(i).get(4));
                    labelv15.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp15.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp15.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp15.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc16.getText().equals((String) datos.get(i).get(1))){
                    labeln16.setText((String) datos.get(i).get(4));
                    labelv16.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp16.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp16.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp16.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc17.getText().equals((String) datos.get(i).get(1))){
                    labeln17.setText((String) datos.get(i).get(4));
                    labelv17.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp17.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp17.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp17.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc18.getText().equals((String) datos.get(i).get(1))){
                    labeln18.setText((String) datos.get(i).get(4));
                    labelv18.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp18.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp18.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp18.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc19.getText().equals((String) datos.get(i).get(1))){
                    labeln19.setText((String) datos.get(i).get(4));
                    labelv19.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp19.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp19.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp19.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc20.getText().equals((String) datos.get(i).get(1))){
                    labeln20.setText((String) datos.get(i).get(4));
                    labelv20.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp20.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp20.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp20.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc21.getText().equals((String) datos.get(i).get(1))){
                    labeln21.setText((String) datos.get(i).get(4));
                    labelv21.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp21.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp21.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp21.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc22.getText().equals((String) datos.get(i).get(1))){
                    labeln2.setText((String) datos.get(i).get(4));
                    labelv2.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp2.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp22.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp22.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc23.getText().equals((String) datos.get(i).get(1))){
                    labeln23.setText((String) datos.get(i).get(4));
                    labelv23.setText((String) datos.get(i).get(5));
                               
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp23.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp23.setStyle("-fx-background-color: #2fac66" );

                    }
                    
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp23.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc24.getText().equals((String) datos.get(i).get(1))){
                    labeln24.setText((String) datos.get(i).get(4));
                    labelv4.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp24.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp24.setStyle("-fx-background-color: #2fac66" );
                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp24.setStyle("-fx-background-color: #f9b233" );
                    }                  
                }
                
                if(labelc25.getText().equals((String) datos.get(i).get(1))){
                    labeln25.setText((String) datos.get(i).get(4));
                    labelv25.setText((String) datos.get(i).get(5));
                    
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp25.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp25.setStyle("-fx-background-color: #2fac66" );
                    }
                    if (Integer.parseInt(datos.get(i).get(5).toString()) >= 2) {
                        bp25.setStyle("-fx-background-color: #f9b233");
                    }
                }
                
                if(labelc26.getText().equals((String) datos.get(i).get(1))){
                    labeln26.setText((String) datos.get(i).get(4));
                    labelv26.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp26.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp26.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp26.setStyle("-fx-background-color: #f9b233" );
                    }
                }
 
                if(labelc27.getText().equals((String) datos.get(i).get(1))){
                    labeln27.setText((String) datos.get(i).get(4));
                    labelv27.setText((String) datos.get(i).get(5));
                    
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp27.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp27.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp27.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc28.getText().equals((String) datos.get(i).get(1))){
                    labeln28.setText((String) datos.get(i).get(4));
                    labelv28.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp28.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp28.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp28.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc29.getText().equals((String) datos.get(i).get(1))){
                    labeln29.setText((String) datos.get(i).get(4));
                    labelv29.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp29.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp29.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp29.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc30.getText().equals((String) datos.get(i).get(1))){
                    labeln30.setText((String) datos.get(i).get(4));
                    labelv30.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp30.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp30.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp30.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc31.getText().equals((String) datos.get(i).get(1))){
                    labeln31.setText((String) datos.get(i).get(4));
                    labelv31.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp31.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp31.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp31.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc32.getText().equals((String) datos.get(i).get(1))){
                    labeln32.setText((String) datos.get(i).get(4));
                    labelv32.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp32.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp32.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp32.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc33.getText().equals((String) datos.get(i).get(1))){
                    labeln33.setText((String) datos.get(i).get(4));
                    labelv33.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp33.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp33.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp33.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc34.getText().equals((String) datos.get(i).get(1))){
                    labeln34.setText((String) datos.get(i).get(4));
                    labelv34.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp34.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp34.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp34.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc35.getText().equals((String) datos.get(i).get(1))){
                    labeln35.setText((String) datos.get(i).get(4));
                    labelv35.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp35.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp35.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp35.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                
                if(labelc36.getText().equals((String) datos.get(i).get(1))){
                    labeln36.setText((String) datos.get(i).get(4));
                    labelv36.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp36.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp36.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp36.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc37.getText().equals((String) datos.get(i).get(1))){
                    labeln37.setText((String) datos.get(i).get(4));
                    labelv37.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp37.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp37.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp37.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc38.getText().equals((String) datos.get(i).get(1))){
                    labeln38.setText((String) datos.get(i).get(4));
                    labelv38.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp38.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp38.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp38.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc39.getText().equals((String) datos.get(i).get(1))){
                    labeln39.setText((String) datos.get(i).get(4));
                    labelv39.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp39.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp39.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp39.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc40.getText().equals((String) datos.get(i).get(1))){
                    labeln40.setText((String) datos.get(i).get(4));
                    labelv39.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp40.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp40.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp40.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc41.getText().equals((String) datos.get(i).get(1))){
                    labeln41.setText((String) datos.get(i).get(4));
                    labelv41.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp41.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp41.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp41.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc42.getText().equals((String) datos.get(i).get(1))){
                    labeln42.setText((String) datos.get(i).get(4));
                    labelv42.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp42.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp42.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp42.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc43.getText().equals((String) datos.get(i).get(1))){
                    labeln43.setText((String) datos.get(i).get(4));
                    labelv43.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp43.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp43.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp43.setStyle("-fx-background-color: #f9b233" );
                    }
                }

                if(labelc44.getText().equals((String) datos.get(i).get(1))){
                    labeln44.setText((String) datos.get(i).get(4));
                    labelv44.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp44.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp44.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp44.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc45.getText().equals((String) datos.get(i).get(1))){
                    labeln45.setText((String) datos.get(i).get(4));
                    labelv45.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp45.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp45.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp45.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc46.getText().equals((String) datos.get(i).get(1))){
                    labeln46.setText((String) datos.get(i).get(4));
                    labelv46.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp46.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp46.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp46.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc47.getText().equals((String) datos.get(i).get(1))){
                    labeln47.setText((String) datos.get(i).get(4));
                    labelv47.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp47.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp47.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp47.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc48.getText().equals((String) datos.get(i).get(1))){
                    labeln48.setText((String) datos.get(i).get(4));
                    labelv48.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp48.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp48.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp48.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc49.getText().equals((String) datos.get(i).get(1))){
                    labeln49.setText((String) datos.get(i).get(4));
                    labelv49.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp49.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp49.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp49.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc50.getText().equals((String) datos.get(i).get(1))){
                    labeln50.setText((String) datos.get(i).get(4));
                    labelv50.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp50.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp50.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp50.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc51.getText().equals((String) datos.get(i).get(1))){
                    labeln51.setText((String) datos.get(i).get(4));
                    labelv51.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp51.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp51.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp51.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc52.getText().equals((String) datos.get(i).get(1))){
                    labeln52.setText((String) datos.get(i).get(4));
                    labelv52.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp52.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp52.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp52.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                if(labelc53.getText().equals((String) datos.get(i).get(1))){
                    labeln53.setText((String) datos.get(i).get(4));
                    labelv53.setText((String) datos.get(i).get(5));
                    if(Double.parseDouble(datos.get(i).get(4).toString())<3){
                        bp53.setStyle("-fx-background-color: #d94352" );

                    }
                    if(Double.parseDouble(datos.get(i).get(4).toString())>=3){
                        bp53.setStyle("-fx-background-color: #2fac66" );

                    }
                    if(Integer.parseInt(datos.get(i).get(5).toString())>=2){
                        bp53.setStyle("-fx-background-color: #f9b233" );
                    }
                }
                
                
            }

            
        }
        
        

        //labelt1.textProperty().setValue((String) SampleController.datos.get(0).get(2));
    }
    @FXML
    private void EventoButton(ActionEvent event) throws IOException, Exception {
      llenar();


          

        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
