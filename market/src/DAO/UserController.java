package DAO;

import Connection.Conn;
import Model.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class UserController {

    public void newUser(User user) {
        String sql = "insert into market.user (name, email, password) values (?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = Objects.requireNonNull(Conn.getConnection()).prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error to try create a new user");
        }
    }
}
