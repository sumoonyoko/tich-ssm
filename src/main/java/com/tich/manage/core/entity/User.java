package com.tich.manage.core.entity;

public class User {
    private String id;
 
    private String userName;
 
    private String userGender;
 
    private String userBirthday;
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
 
    public String getUserGender() {
        return userGender;
    }
 
    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }
 
    public String getUserBirthday() {
        return userBirthday;
    }
 
    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday == null ? null : userBirthday.trim();
    }
}
