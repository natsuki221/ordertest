package orderFirst.demo;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDAO {

    private Connection conn;

    public boolean checkPassword(String name, String pw) {

        boolean access = false;

        System.out.println("name = " + name + " password = " + pw);

        conn = DBConnection.getConnection();
        String query = "select * from user where username like ? and password like ?";

        try {
            PreparedStatement ps
                    = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, name);
            ps.setString(2, pw);
            ResultSet rset = ps.executeQuery();
            System.out.println("success");

            rset.last();
            if (rset.getRow() == 1) {
                access = true;
                System.out.println("登入成功！ 使用者：" + name);
                rset.close();

            } else {
                System.out.println(rset.getRow());
                rset.close();
            }

        } catch (SQLException ex) {
            System.out.println("SQL錯誤：" + ex);
        }

        return access;
    }

    public int returnId(String name, String pw) {

        System.out.println("returnID: name = " + name + " password = " + pw);
        
        conn = DBConnection.getConnection();
        String query = "select * from user where username like ? and password like ?";

        try {
            PreparedStatement ps
                    = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, name);
            ps.setString(2, pw);
            ResultSet rset = ps.executeQuery();
            System.out.println("Login success");

            rset.last();
            System.out.println(rset.getRow());
            Users user = new Users();
            user.setUserID(rset.getInt("user_id"));
            int usr = user.getUserID();
            System.out.println(usr);

            return usr;

        } catch (SQLException ex) {

            System.out.println("SQL錯誤：" + ex);

            return 0;
        }

    }
}
