import utils.jdbcutils;

import java.sql.*;

public class test1 {
    public static void main(String[] args) throws SQLException {
        jdbcutils.insertUser("3","333333","777777");
        jdbcutils.deleteUser("1");
     jdbcutils.updateUser("111111","2");
     jdbcutils.selectUser();


    }


}
