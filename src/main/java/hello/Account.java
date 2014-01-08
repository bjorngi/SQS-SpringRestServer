package hello;

/**
 * Created by bjorn on 1/8/14.
 */
public class Account {
    private long id;
    private String name;
    private String email;

    public Account(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
