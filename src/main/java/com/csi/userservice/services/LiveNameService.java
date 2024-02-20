package com.csi.userservice.services;

import com.csi.userservice.entities.AccountUser;
import com.csi.userservice.entities.LiveName;
import com.csi.userservice.modal.NameData;
import com.csi.userservice.modal.UserData;

import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;

public interface LiveNameService {

    //user operations

    //create
    LiveName createLiveName(HttpServletRequest servletRequest,NameData nameData, String userId);

    //get all user
    List<LiveName> readAllNames();

    //get single user of given userId
    Optional<LiveName> readLiveName(String userId);

    //TODO: update
    Optional<LiveName> updateAccountUser(String userId, NameData nameData);

    //TODO: delete
    Optional<LiveName> deleteAccountUser(String userId);


}
