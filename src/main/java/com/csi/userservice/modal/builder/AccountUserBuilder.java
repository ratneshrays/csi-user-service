///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.csi.userservice.modal.builder;
//
//import com.csi.userservice.entities.AccountUser;
//import com.csi.userservice.modal.LiveName;
//
///**
// *
// * @author ratnesh
// */
//public class AccountUserBuilder{
//
//    public static String userId;
//    public static String name;
//    public static LiveName liveName;
//    public static String username;
//    public static String password;
//    public static String accountUrl;
//    public static String registeredEmailId;
//    public static String registeredMobileNumber;
//    public static String about;
//    
//
//    public AccountUserBuilder setUserId(String userId) {
//        this.userId = userId;
//        return this;
//    }
//    
//    public AccountUserBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//    
//    public AccountUserBuilder setLiveName(LiveName liveName) {
//        this.liveName = liveName;
//        return this;
//    }
//    
//    public AccountUserBuilder setUsername(String username) {
//        this.username = username;
//        return this;
//    }
//    
//    public AccountUserBuilder setPassword(String password) {
//        this.password = password;
//        return this;
//    }
//    
//    public AccountUserBuilder setAccountUrl(String accountUrl) {
//        this.accountUrl = accountUrl;
//        return this;
//    }
//    
//    public AccountUserBuilder setEmail(String registeredEmailId) {
//        this.registeredEmailId = registeredEmailId;
//        return this;
//    }
//    
//    public AccountUserBuilder setRegisteredMobileNumber(String registeredMobileNumber) {
//        this.registeredMobileNumber = registeredMobileNumber;
//        return this;
//    }
//
//    public AccountUserBuilder setAbout(String about) {
//        this.about = about;
//        return this;
//    }
//    
//    public AccountUser build(){
//        return new AccountUser(this);
//    }
//    
//}
