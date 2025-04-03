package dao;

import entity.Airplane;
import model.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AirplaneDao {
    public void create(Airplane airplane) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into airplane(id,airplaneId,routeId) values(?,?,?)");

            preparedStatement.setInt(1,airplane.getId());
            preparedStatement.setInt(2,airplane.getAirplaneId());
            preparedStatement.setInt(3,airplane.getRouteId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void update(Airplane airplane) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update airplane set airplaneId = ?, routeId = ? where id = ?");
            preparedStatement.setInt(1,airplane.getAirplaneId());
            preparedStatement.setInt(2,airplane.getRouteId());
            preparedStatement.setInt(3,airplane.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void delete(Airplane airplane) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from airplane where id = ?");
            preparedStatement.setInt(1,airplane.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
