package voedsel;

public class DataUser {
    private String username;
    private String password;

    public DataUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
