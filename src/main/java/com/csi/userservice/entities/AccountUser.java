package com.csi.userservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "accountUser")
public class AccountUser {

    @Id
    @Column(name = "userId", unique = true, nullable = false)
    private String userId;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "username", unique = true)
    private String username;
    
    @Column(name = "password")
    private String password;

    @Column(name = "accountUrl")
    private String accountUrl;
    
    @Column(name = "registeredEmailId")
    private String registeredEmailId;
    
    @Column(name = "registeredMobileNumber")
    private String registeredMobileNumber;
    
    @Column(name = "about")
    private String about;    
    
    public AccountUser() {
    }

//    public AccountUser(AccountUserBuilder builder) {
//        this.userId = builder.userId;
//        this.name = builder.name;
//        this.liveName = builder.liveName;
//        this.username = builder.username;
//        this.password = builder.password;
//        this.accountUrl = builder.accountUrl;
//        this.registeredEmailId = builder.registeredEmailId;
//        this.registeredMobileNumber = builder.registeredMobileNumber;
//        this.about = builder.about;
//    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public String getRegisteredEmailId() {
        return registeredEmailId;
    }

    public void setRegisteredEmailId(String registeredEmailId) {
        this.registeredEmailId = registeredEmailId;
    }

    public String getRegisteredMobileNumber() {
        return registeredMobileNumber;
    }

    public void setRegisteredMobileNumber(String registeredMobileNumber) {
        this.registeredMobileNumber = registeredMobileNumber;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
}
