package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Patient;

public class DatabaseConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false&serverTimezone=UTC";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";
    
    public static void addPatient(Patient p1) {
        String query = "INSERT INTO patient(firstName, gender, patient_type) VALUES (?, ?, ?)";
        try{
            Connection conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p1.getName());
            stmt.setString(2, p1.getGender());
            stmt.setString(3, p1.getPatientType());
            int rows = stmt.executeUpdate();
            System.out.println(rows);
            conn.close();
        } catch(SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch(Exception ex) {
            System.out.println(ex);
        }

    }
    
    public static ArrayList<Patient> getPatients(){
        ArrayList<Patient> patients = new ArrayList();
        String query = "SELECT * FROM patient";
        try{
            Connection conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setName(rs.getString("firstName"));
                p1.setGender(rs.getString("gender"));
                p1.setPatientType(rs.getString("patient_type"));
                patients.add(p1);
            }
            rs.close();
            conn.close();
        } catch(SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return patients;
    }
    
    public static void getPatientName(){
        String query = "SELECT first_name, last_name FROM patient";
    }
            
    public static void updatePatient(Patient oldPatient, Patient updatePatient) {
        String query = "UPDATE patient SET firstName = ?, gender = ?, patient_type = ? WHERE id = ?";
        try {
            Connection conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatePatient.getName());
            stmt.setString(2, updatePatient.getGender());
            stmt.setString(3, updatePatient.getPatientType());
            stmt.setInt(4, oldPatient.getId());
            int rows = stmt.executeUpdate();
            System.out.println(rows);
            conn.close();
        } catch(SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
                    
    public static void deletePatient(Patient p1){
        String query = "DELETE FROM patient WHERE id = ? ;";
        try {
            Connection conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println(rows);
            conn.close();
        } catch(SQLException sqle) {
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
