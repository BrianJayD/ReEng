package ca.uoit.csci4100u.reeng.inc;

/**
 * Created by brianjayd on 2018-07-28.
 */

public class User {
    private String username;
    private String password;
    private String userFName;
    private String userLName;
    private int userGoalCount;

    public User(String username,String password,String userFName,String userLName, int userGoalCount){
        this.username=username;
        this.password=password;
        this.userFName=userFName;
        this.userLName=userLName;
        this.userGoalCount=userGoalCount;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserFName() {
        return userFName;
    }

    public void setUserFName(String userFName) {
        this.userFName = userFName;
    }

    public String getUserLName() {
        return userLName;
    }

    public void setUserLName(String userLName) {
        this.userLName = userLName;
    }

    public int getUserGoalCount() {
        return userGoalCount;
    }

    public void setUserGoalCount(int userGoalCount) {
        this.userGoalCount = userGoalCount;
    }
}

