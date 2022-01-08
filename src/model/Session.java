package model;


public class Session {
    public static String id;
    public static String username;
    public static String password;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Session.id = id;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Session.password = password;
    }
    
    
    
}
