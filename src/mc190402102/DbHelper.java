package mc190402102;

/**
 *
 * @author MOHAMMAD
 * @student ID: MC190402102
 */

// imports
import java.util.*;
import javax.swing.*;
import java.sql.*;

class DbHelper {
    private static final String FILE_NAME = ".\\data\\MC190402102.accdb";
    
    public Patient searchPatient(String id){
        Patient patient = new Patient();
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://" + FILE_NAME;
            Connection con = DriverManager.getConnection(url);
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM Patient WHERE ID="+id;
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()){
                id = rs.getString("ID");
                String name = rs.getString("Patient_Name");
                String address = rs.getString("Address");
                String isEffected = rs.getString("Covid-19_Effected");
                
                patient.setID(id);
                patient.setName(name);
                patient.setAddress(address);
                patient.setEffected(isEffected);
                
                break;        
            }
            con.close();
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "ClassNotFound Exception: " + ex);
            System.exit(0);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ClassNotFound Exception: " + ex);
            System.exit(0);
        }
        if (patient.getID()==" ")
            JOptionPane.showMessageDialog(null, "No Record Found against the Patient ID: "+id);
        return patient;
    }
    
    public void savePatient(Patient patient){
        try {
            String id = patient.getID();
            String name = patient.getName();
            String address = patient.getAddress();
            String effected = patient.getEffected();
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://" + FILE_NAME;
            Connection con = DriverManager.getConnection(url);
            
            String sql = "INSERT INTO Patient VALUES(?,?,?,?)";
            PreparedStatement Pstatement = con.prepareStatement(sql);
            Pstatement.setString(1, id);
            Pstatement.setString(2, name);
            Pstatement.setString(3, address);
            Pstatement.setString(4, effected);
            
            int row = Pstatement.executeUpdate();
            if(row>0)
                JOptionPane.showMessageDialog(null, "Data inserted against the Patient ID: "+id);
            con.close();
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ClassNotFound Exception: "+ex);
            System.exit(0);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception: " + ex);
            System.exit(0);
        }
        
        }
};
