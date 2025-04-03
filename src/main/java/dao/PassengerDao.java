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
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Passenger passenger) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update passenger set passport = ?, name = ?, email = ?, luggageId = ?, passengerId = ? where id = ?");
            preparedStatement.setString(1,passenger.getPassport());
            preparedStatement.setString(2,passenger.getName());
            preparedStatement.setString(3,passenger.getEmail());
            preparedStatement.setInt(4,passenger.getLuggageId());
            preparedStatement.setInt(5,passenger.getPassengerId());
            preparedStatement.setInt(6,passenger.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(Passenger passenger) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from passenger where id = ?");
            preparedStatement.setInt(1,passenger.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
