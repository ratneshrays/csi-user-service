/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.userservice.modal;

import java.util.Collection;

/**
 *
 * @author ratnesh
 */
public class LoginData {
    
    String username;
    String password;
    String accountUrl;
    private String userId;
    private String accessToken;
    private String refreshToken;
    private long expireAt;
    private Collection<String> authorities;

    public LoginData() {
    }

    public LoginData(String username, String password, String accountUrl, String userId, String accessToken, String refreshToken, long expireAt, Collection<String> authorities) {
        this.username = username;
        this.password = password;
        this.accountUrl = accountUrl;
        this.userId = userId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expireAt = expireAt;
        this.authorities = authorities;
    }

    public LoginData(String username, String password, String accountUrl) {
        this.username = username;
        this.password = password;
        this.accountUrl = accountUrl;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public long getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(long expireAt) {
        this.expireAt = expireAt;
    }

    public Collection<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<String> authorities) {
        this.authorities = authorities;
    }
    
    
}
