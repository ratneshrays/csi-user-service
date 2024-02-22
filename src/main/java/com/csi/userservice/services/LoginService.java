/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.userservice.services;

import com.csi.userservice.modal.LoginData;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ratnesh
 */
public interface LoginService {
    
    //Login
    LoginData login(HttpServletRequest servletRequest, LoginData loginData);
    
}
