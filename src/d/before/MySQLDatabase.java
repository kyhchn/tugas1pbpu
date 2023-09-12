package d.before;

public class MySQLDatabase {
    String host;
    int port;
    String username;
    String password;

    public MySQLDatabase(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public void update() {
        // update database
    }

    public void insert() {
        // insert into database
    }

    public void delete() {
        // delete from database
    }
}
