package com.test.entity;

/**
 * Created by chenhansen on 2017/9/17.
 */
public class UserTest {
    private String username;
    private String password;

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

    public UserTest(String username, String password){
        this.username=username;
        this.password=password;

    }
}
