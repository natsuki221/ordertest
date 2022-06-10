package orderFirst.demo;

public class Users {

    private int user_id;
    private String user_name;
    private String password;

    public Users() {

    }
    
    public int getUserID() {
        return user_id;
    }

    public void setUserID(int user_id) {
        this.user_id = user_id;
    }
    
    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Users{" + "user_id=" + user_id + "user_name=" + user_name + ", password=" + password + '}';
    }
}
