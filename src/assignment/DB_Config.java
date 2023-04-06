package assignment;

import java.sql.*;

public class DB_Config {


    public static void main(String[] args){
        try{
            Class.forName("org.postgresql.Driver");
      Connection con= DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/flight_db","postgres","1234");
//here flight_data is database name, postgres is username and password is 1234
        PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");

            
            con.close();
            System.out.println("Successfully connected");
        }catch(Exception e){ System.out.println(e);}
    }



}


    
