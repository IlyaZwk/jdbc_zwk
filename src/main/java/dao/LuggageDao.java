package dao;

import entity.Luggage;
import model.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LuggageDao {
    public void create(Luggage luggage) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into luggage(id,weight,luggageId) values(?,?,?)");
            preparedStatement.setInt(1,luggage.getId());
            preparedStatement.setInt(2,luggage.getWeight());
            preparedStatement.setInt(3,luggage.getLuggageId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Luggage luggage) {

    }
    public void delete(Luggage luggage) {

    }
}
