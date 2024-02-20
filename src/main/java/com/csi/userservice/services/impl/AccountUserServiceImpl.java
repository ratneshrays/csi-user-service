package com.csi.userservice.services.impl;

import com.csi.userservice.entities.AccountUser;
import com.csi.userservice.entities.LiveName;
import com.csi.userservice.modal.UserData;
import com.csi.userservice.repositories.AccountUserRepository;
import com.csi.userservice.services.AccountUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;

@Service
public class AccountUserServiceImpl implements AccountUserService {

    @Autowired
    private AccountUserRepository userRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public AccountUser createAccountUser(HttpServletRequest servletRequest, UserData userData) {
        logger.info("Creating User in the System");
        AccountUser accountUser = new AccountUser();
        LiveName liveName = new LiveName();
        //AccountUrl
        String accountUrl = servletRequest.getRemoteHost();
        accountUser.setAccountUrl(accountUrl);
        //generate  unique userid
        String randomAccountUserId = UUID.randomUUID().toString();
        accountUser.setUserId(randomAccountUserId);
        //username 
        String username = userData.getRegisteredEmailId();
        accountUser.setUsername(username);
        //Password
        String password = userData.getRegisteredMobileNumber();
        //PasswordHashing{}
        accountUser.setPassword(password);
        accountUser.setName(userData.getName());
        accountUser.setAbout(userData.getAbout());
        accountUser.setRegisteredEmailId(userData.getRegisteredEmailId());
        accountUser.setRegisteredMobileNumber(userData.getRegisteredMobileNumber());
        logger.info("User Created in the System");
        return userRepository.save(accountUser);
    }

    @Override
    public List<AccountUser> readAllAccountUser() {
        //implement RATING SERVICE CALL: USING REST TEMPLATE
        return userRepository.findAll();
    }

    //get single user
    @Override
    public Optional<AccountUser> readAccountUser(String userId) {
        //get user from database with the help  of user repository
        Optional<AccountUser> user = userRepository.findById(userId);
        return user;
    }

    @Override
    public Optional<AccountUser> updateAccountUser(String id, AccountUser user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<AccountUser> deleteAccountUser(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
