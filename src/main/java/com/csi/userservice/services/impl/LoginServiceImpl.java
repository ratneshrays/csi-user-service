/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.userservice.services.impl;

import com.csi.userservice.entities.AccountUser;
import com.csi.userservice.modal.LoginData;
import com.csi.userservice.repositories.AccountUserRepository;
import com.csi.userservice.services.LoginService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ratnesh
 */
@Service
public class LoginServiceImpl implements LoginService{
    
    @Autowired
    private AccountUserRepository userRepository;
    
    @Override
    public LoginData login(HttpServletRequest servletRequest, LoginData loginData) {
        String accountUrl = loginData.getAccountUrl();
        String username = loginData.getUsername();
        String password = loginData.getPassword();
        //fetch User Data from account User
        AccountUser accountUser = userRepository.findByUsername(username);
        if(accountUser != null){
            String storedPassword = accountUser.getPassword();
            if(password.equals(storedPassword)){
                loginData.setAccessToken("success");
                loginData.setRefreshToken("sucess");
                return loginData;
            }
        }
        return null;
    }
    
}
