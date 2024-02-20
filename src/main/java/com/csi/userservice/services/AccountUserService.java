package com.csi.userservice.services;

import com.csi.userservice.entities.AccountUser;
import com.csi.userservice.modal.UserData;

import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;

public interface AccountUserService {

    //user operations

    //create
    AccountUser createAccountUser(HttpServletRequest servletRequest, UserData userData);

    //get all user
    List<AccountUser> readAllAccountUser();

    //get single user of given userId
    Optional<AccountUser> readAccountUser(String id);

    //TODO: update
    Optional<AccountUser> updateAccountUser(String id, AccountUser user);

    //TODO: delete
    Optional<AccountUser> deleteAccountUser(String id);


}
