package dao;

import entity.Route;
import model.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RouteDao {
    public void create(Route route) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into route(id,airplaneId,arrivalTime,departureTime,arrivalLocationId,departureLocationId) values(?,?,?,?,?,?)");
            preparedStatement.setInt(1,route.getId());
            preparedStatement.setInt(2,route.getAirplaneId());
            preparedStatement.setString(3,route.getArrivalTime());
            preparedStatement.setString(4,route.getDepartureTime());
            preparedStatement.setInt(5,route.getArrivalLocationId());
            preparedStatement.setInt(6,route.getDepartureLocationId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Route route) {

    }
    public void delete(Route route) {

    }
}
