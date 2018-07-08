package utils;

import java.sql.*;

/**
 * Created by bitzero on 6/26/18.
 */
public class MysqlCon {

    Connection con;
    static  String DEPARTMENTS_TABLE_NAME = "departments";
    static  String STAFF_TABLE_NAME = "staff";

    public Connection connectTODb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/backend-test",
                    "root",
                    "@OlooJade21");

            /*After Connection Create table that do not exist*/
            createTables();

            return con;
        }catch(Exception e)
        {
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return null;
    }

    private void createTables(){

        String sqlCreateDepartmentsTable = "CREATE TABLE IF NOT EXISTS " + DEPARTMENTS_TABLE_NAME + " (" +
                "  departmentID INT NOT NULL PRIMARY KEY," +
                "  name VARCHAR(40)," +
                "  description VARCHAR(255)," +
                "  dateModified VARCHAR(20)," +
                "  dateCreated VARCHAR(20)" +
                ") ";

        String sqlCreateStaffTable = "CREATE TABLE IF NOT EXISTS " + STAFF_TABLE_NAME + " (" +
                "  staffID INT NOT NULL PRIMARY KEY," +
                "  departmentID INT," +
                "  firstName VARCHAR(40)," +
                "  lastName VARCHAR(40)," +
                "  description VARCHAR(255)," +
                "  dateModified VARCHAR(20)," +
                "  dateCreated VARCHAR(20)," +
                "  FOREIGN KEY (departmentID) REFERENCES departments(departmentID)" +
                ")";
        try {
            Statement stmt = con.createStatement();

            stmt.execute(sqlCreateDepartmentsTable);
            stmt.execute(sqlCreateStaffTable);

            System.out.println("Tables creation attempt completed!");
        }catch (SQLException e){
            System.err.println("Tables creation attempt Failed!");
        }

    }

    public void create(){
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from students");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}