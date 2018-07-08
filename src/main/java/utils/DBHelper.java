package utils;

import wsdl.Departments;
import wsdl.Staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by bitzero on 6/26/18.
 */
public class DBHelper {

    public Departments[] storeDepartments(Departments departments){
        Connection dbConnection = new MysqlCon().connectTODb();

        String insertTableSQL = "INSERT INTO departments " +
                "(departmentID, name, description, dateModified, dateCreated) " +
                "VALUES (?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);

            preparedStatement.setInt(1, departments.getDepartmentID());
            preparedStatement.setString(2, departments.getName());
            preparedStatement.setString(3, departments.getDescription());
            preparedStatement.setString(4, departments.getDateModified());
            preparedStatement.setString(5, departments.getDateCreated());

            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            System.out.println("Record is inserted into departments table!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }

                if (dbConnection != null) {

                    dbConnection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public Departments[] storeStaff(Staff staff){
        Connection dbConnection = new MysqlCon().connectTODb();

        String insertTableSQL = "INSERT INTO staff " +
                "(staffID, departmentID, firstName, lastName, dateModified, dateCreated) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);

            preparedStatement.setInt(1, staff.getStaffID());
            preparedStatement.setInt(2, staff.getDepartmentID());
            preparedStatement.setString(3, staff.getFirstName());
            preparedStatement.setString(4, staff.getLastName());
            preparedStatement.setString(5, staff.getDateModified());
            preparedStatement.setString(6, staff.getDateCreated());

            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            System.out.println("Record is inserted into staff table!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (dbConnection != null) {
                    dbConnection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
