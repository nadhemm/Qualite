package tn.insat.nouveautes_java_7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo_Try_With_Resources {

    public static void main(String[] args) {

        try (Connection connection = getConnection()) {
            String sql = "SELECT ...";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            ResultSet resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                // exploiter le resulset resultset
            }
        } catch ( SQLException  e ) {
            e.printStackTrace();
        }
    }

        private static Connection getConnection () {
            return null;
        }
    }
