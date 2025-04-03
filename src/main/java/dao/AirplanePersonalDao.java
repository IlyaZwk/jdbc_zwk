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
            PreparedStatement preparedStatement = connection.prepareStatement("insert into airplane_Personal(id,airplaneId,personalId) values(?,?,?)");
            preparedStatement.setInt(1,airplanePersonal.getAirplanePersonalId());
            preparedStatement.setInt(2,airplanePersonal.getAirplanePersonalAirplaneId());
            preparedStatement.setInt(3,airplanePersonal.getAirplanePersonalPersonalId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void update(AirplanePersonal airplanePersonal) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update airplane_personal set airplaneId = ?, personalId = ? where id = ? ");
            preparedStatement.setInt(1,airplanePersonal.getAirplanePersonalAirplaneId());
            preparedStatement.setInt(2,airplanePersonal.getAirplanePersonalPersonalId());
            preparedStatement.setInt(3,airplanePersonal.getAirplanePersonalId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void delete(AirplanePersonal airplanePersonal) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from airplane_personal where id = ?");
            preparedStatement.setInt(1,airplanePersonal.getAirplanePersonalAirplaneId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
