package TestingUsingRestAssured;

public class Tester {
    private  int id;
    private String title;
    private String auth;
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuth() {
        return auth;
    }


    public Tester(int id, String title, String auth) {
        this.id = id;
        this.title = title;
        this.auth = auth;
    }
}
