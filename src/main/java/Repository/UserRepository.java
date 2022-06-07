package Repository;

import ConFig.ConnectionProvide;
import Entity.Role;
import Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    public static void findUserByProjectID(int projectID) {
        String sql = "SELECT * FROM final_4.user\n" +
                "where project_id=? and role='EMPLOYEE'";

        try {
            Connection connection = ConnectionProvide.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, projectID);
            ResultSet resultSet = statement.executeQuery();

            System.out.printf("%-5s|%-15s|%-20s|%-10s|%-10s|%-15s|%-10s|%-10s|%n", "Id", "Fullname", "Email", "ExpInYear", "ExpInYear", "ProSkill", "ProjectID", "Role");
            System.out.println("------------------------------------------------------------------------------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullname = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                int exp = resultSet.getInt("exp_in_year");
                String proSkill = resultSet.getString("pro_skill");
                int projectid = resultSet.getInt("project_id");
                String role = resultSet.getString("role");
                User user = new User(id, fullname, email, password, exp, proSkill, projectid, Role.valueOf(role));

                System.out.printf("%-5s|%-15s|%-20s|%-10s|%-10s|%-15s|%-10s|%-10s|%n", user.getId(), user.getFullname(), user.getEmail(), user.getExpInYear(), user.getExpInYear(), user.getProSkill(), user.getProjectID(), user.getRole());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void findAllManager() {
        String sql = "SELECT * FROM final_4.user\n" +
                "where  role='MANAGER';";
        try {
            Connection connection = ConnectionProvide.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            System.out.printf("%-5s|%-15s|%-20s|%-10s|%-10s|%-15s|%-10s|%-10s|%n", "Id", "Fullname", "Email", "ExpInYear", "ExpInYear", "ProSkill", "ProjectID", "Role");
            System.out.println("------------------------------------------------------------------------------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullname = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                int exp = resultSet.getInt("exp_in_year");
                String proSkill = resultSet.getString("pro_skill");
                int projectid = resultSet.getInt("project_id");
                String role = resultSet.getString("role");
                User user = new User(id, fullname, email, password, exp, proSkill, projectid, Role.valueOf(role));

                System.out.printf("%-5s|%-15s|%-20s|%-10s|%-10s|%-15s|%-10s|%-10s|%n", user.getId(), user.getFullname(), user.getEmail(), user.getExpInYear(), user.getExpInYear(), user.getProSkill(), user.getProjectID(), user.getRole());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static User LogInManager(String email, String password) {
        String sql = "SELECT * FROM final_4.user\n" +
                "where email= ? and `password`=? and role='MANAGER';";
        try {
            Connection connection = ConnectionProvide.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fullname = resultSet.getString("full_name");
                String email1 = resultSet.getString("email");
                String password1 = resultSet.getString("password");
                int exp = resultSet.getInt("exp_in_year");
                String proSkill = resultSet.getString("pro_skill");
                int projectid = resultSet.getInt("project_id");
                String role = resultSet.getString("role");
                User user = new User(id, fullname, email1, password1, exp, proSkill, projectid, Role.valueOf(role));
                return user;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

}
