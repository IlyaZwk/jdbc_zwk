package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
    private static DataSource instance;
    private static Properties props;

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }
    private DataSource() {
        props = new Properties();
        try (InputStream is = new FileInputStream("src/main/resources/db.properties")) {
            props.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(props.getProperty("db.url"),props.getProperty("db.user"),props.getProperty("db.password"));
    }
}
