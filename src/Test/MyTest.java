package Test;

import connect.Dao;

import java.sql.Connection;
import java.sql.SQLException;

public class MyTest {
    public static void main(String[] args) throws SQLException {
        Dao dao = new Dao();
        Connection connection = dao.getConnection();
        if(connection!=null) {
            System.out.println("successfully connect");
        } else {
            System.out.println("fail to connect");
        }
    }
}
