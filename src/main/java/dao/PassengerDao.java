package dao;

import entity.Passenger;
import model.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PassengerDao {
    public void create(Passenger passenger) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into passenger(id,passport,name,email,luggageId,passengerId) values(?,?,?,?,?,?)");
            preparedStatement.setInt(1,passenger.getId());
            preparedStatement.setString(2,passenger.getPassport());
            preparedStatement.setString(3,passenger.getName());
            preparedStatement.setString(4,passenger.getEmail());
            preparedStatement.setInt(5,passenger.getLuggageId());
            preparedStatement.setInt(6,passenger.getPassengerId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Passenger passenger) {

    }
    public void delete(Passenger passenger) {

    }
}
