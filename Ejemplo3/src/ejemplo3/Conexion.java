/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author BrayanHR09
 */
public class Conexion extends Application {
    ArrayList<Vector> List = new ArrayList<Vector>();

    @Override
    public void start(Stage primaryStage) throws SQLException {
     
//            ArrayList<Vector> datos;
//            datos = consultar("160003801");
//            System.out.println(datos.get(0).get(2));


    }
              public ArrayList<Vector> consultar(String codigo) {
               String cc = "jdbc:postgresql://127.0.0.1/proyecto?" +
                   "user=postgres&password=12345";
               
              try {
                  Class.forName("org.postgresql.Driver");
                  Connection conexion = DriverManager.getConnection(cc);
                  Statement comando = conexion.createStatement();
              
                  String sql = "Select  codigo_estudiante,codigo_materia,veces ,nota from materia_estudiante where codigo_estudiante="+codigo;
                  System.out.println(sql);
                  ResultSet resultado = comando.executeQuery(sql);
                  while(resultado.next()) {
                  Vector<String> vect = new Vector<String>(4);
                vect.add(resultado.getString("codigo_estudiante"));
                vect.add(resultado.getString("codigo_materia"));
                vect.add(resultado.getString("veces"));
                vect.add(resultado.getString("nota"));
               
                List.add(vect);
                 }
                  resultado.close();
                  comando.close();
                  conexion.close();
              } catch(Exception e) {
                  System.out.println(e.getMessage());
              }
            return List;
          }

    
//    public void consultas() throws SQLException{
//        st=con.createStatement(); 
//        String sql = "Select nombre_materia, codigo_materia, nombre_estudiante, codigo_estudiante, nota_materia from estudiantes";
//        try (ResultSet resultado = st.executeQuery(sql)) {
//            while(resultado.next()){
//                String n = resultado.getString("nombre_materia");
//                String a = resultado.getString("codigo_materia");
//                String b = resultado.getString("nombre_estudiante");
//                String x = resultado.getString("codigo_estudiante");
//                String z = resultado.getString("nota_materia");
//                System.out.println(n + " " + a + " "+b  + " "+x  + " "+z);
//            }
//        }
//        st.close();
//        con.close();
//    }
        public static void main(String[] args) {
        launch(args);
    }
    
}