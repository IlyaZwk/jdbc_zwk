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
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(Personal personal) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update personal set type = ?, personalId = ? where id = ?");
            preparedStatement.setString(1,personal.getType());
            preparedStatement.setInt(2,personal.getPersonalId());
            preparedStatement.setInt(3,personal.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(Personal personal) {
        try {
            Connection connection = DataSource.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from personal where id = ?");
            preparedStatement.setInt(1,personal.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
