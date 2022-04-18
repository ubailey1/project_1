package dev.me.utilities;

import dev.me.Utilities.Connect;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class Connect_Test {
    @Test
    void try_connection(){
        Connection dbTry = Connect.makeConnection();
        Assertions.assertNotNull(dbTry);
        if (dbTry != null){
            System.out.println("Connection successful");
        }else {
            System.out.println("Connection failed!");
        }
    }
}
