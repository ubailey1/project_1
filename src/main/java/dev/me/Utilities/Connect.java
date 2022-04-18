package dev.me.Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static Connection makeConnection(){
   try {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://baileydb.ccunoqbobek1.us-east-2.rds.amazonaws.com/ers?user=postgres&password=3dT3chgam3s");
        return conn;
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }

    }


}
