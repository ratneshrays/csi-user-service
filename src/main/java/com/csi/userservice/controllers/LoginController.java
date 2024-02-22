/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.userservice.controllers;

import com.csi.userservice.modal.LoginData;
import com.csi.userservice.services.LoginService;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ratnesh
 */
@RestController
@RequestMapping("/api/v1/login")
public class LoginController {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    LoginService loginService;
    
    @PostMapping("/user")
    public ResponseEntity<LoginData> userLogin(HttpServletRequest servletRequest, @RequestBody LoginData loginData) {
        LoginData loginData1 = loginService.login(servletRequest, loginData);
        return ResponseEntity.ok(loginData1);
    }
    
    @GetMapping("/oauth")
    public ResponseEntity<LoginData> oAuthLogin(@RegisteredOAuth2AuthorizedClient("okta") OAuth2AuthorizedClient client,
            @AuthenticationPrincipal OidcUser user, Model model) {
        logger.info("user email id : {} ", user.getEmail());
        //creating auth response object
        LoginData loginData = new LoginData();
        //setting email to authresponse
        loginData.setUserId(user.getEmail());
        //setting toke to auth response
        loginData.setAccessToken(client.getAccessToken().getTokenValue());
        loginData.setRefreshToken(client.getRefreshToken().getTokenValue());
        loginData.setExpireAt(client.getAccessToken().getExpiresAt().getEpochSecond());
        List<String> authorities = user.getAuthorities().stream().map(grantedAuthority -> {
            return grantedAuthority.getAuthority();
        }).collect(Collectors.toList());
        loginData.setAuthorities(authorities);
        return new ResponseEntity<>(loginData, HttpStatus.OK);


    }
}
