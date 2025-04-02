package dao;

import entity.Personal;
import model.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonalDao {
    public void create(Personal personal) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into personal(id,type,personalId) values(?,?,?)");
            preparedStatement.setInt(1,personal.getId());
            preparedStatement.setString(2,personal.getType());
            preparedStatement.setInt(3,personal.getPersonalId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Personal personal) {

    }
    public void delete(Personal personal) {

    }
}
