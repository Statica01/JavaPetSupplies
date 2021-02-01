package dbData;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbDataContext {


    public static Connection connection;

    private DbDataContext() {
    }

    public static Connection getDbConnection() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = ("jdbc:sqlserver://localhost;database=JavaPetSupplies;integratedSecurity=true;");
            Connection connection = DriverManager.getConnection(connectionUrl);
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        return connection;
    }


}

