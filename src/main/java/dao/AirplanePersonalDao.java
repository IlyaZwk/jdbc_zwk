package dao;

import entity.AirplanePersonal;
import model.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AirplanePersonalDao {
    public void create(AirplanePersonal airplanePersonal) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into airplane_Personal() values()");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void update(AirplanePersonal airplanePersonal) {

    }
    public void delete(AirplanePersonal airplanePersonal) {

    }
}
