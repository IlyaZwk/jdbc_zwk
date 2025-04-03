package dao;

import entity.Ticket;
import model.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TicketDao {
    public void create(Ticket ticket) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into ticket(id,routeId,passengerId,passport,type_of_class,luggageId,airplaneId) values(?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,ticket.getId());
            preparedStatement.setInt(2,ticket.getRouteId());
            preparedStatement.setInt(3,ticket.getPassengerId());
            preparedStatement.setString(4,ticket.getPassport());
            preparedStatement.setString(5,ticket.getTypeOfClass());
            preparedStatement.setInt(6,ticket.getLuggageId());
            preparedStatement.setInt(7,ticket.getAirplaneId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Ticket ticket) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update ticket set routeId = ?, passengerId = ?, passport = ?,type_of_class = ?, luggageId = ?, airplaneId = ? where id = ?");
            preparedStatement.setInt(1,ticket.getRouteId());
            preparedStatement.setInt(2,ticket.getPassengerId());
            preparedStatement.setString(3,ticket.getPassport());
            preparedStatement.setString(4,ticket.getTypeOfClass());
            preparedStatement.setInt(5,ticket.getLuggageId());
            preparedStatement.setInt(6,ticket.getAirplaneId());
            preparedStatement.setInt(7,ticket.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(Ticket ticket) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from ticket where id = ?");
            preparedStatement.setInt(1,ticket.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
