package com.csi.userservice.services.impl;

import com.csi.userservice.entities.AccountUser;
import com.csi.userservice.entities.LiveName;
import com.csi.userservice.modal.NameData;
import com.csi.userservice.modal.UserData;
import com.csi.userservice.repositories.AccountUserRepository;
import com.csi.userservice.repositories.LiveNameRepository;
import com.csi.userservice.services.AccountUserService;
import com.csi.userservice.services.LiveNameService;
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
public class LiveNameServiceImpl implements LiveNameService {

    @Autowired
    private LiveNameRepository liveNameRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Optional<LiveName> deleteAccountUser(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LiveName createLiveName(HttpServletRequest servletRequest, NameData nameData, String userId) {
        logger.info("Creating User in the System");
        LiveName liveName = new LiveName();
        liveName.setUserId(userId);
        liveName.setFirstName(nameData.getFirstName());
        liveName.setMiddleName(nameData.getMiddleName());
        liveName.setLastName(nameData.getLastName());
        liveName.setTitle(nameData.getTitle());
        liveName.setNickName(nameData.getNickName());
        logger.info("User Created in the System");
        return liveNameRepository.save(liveName);
    }

    @Override
    public List<LiveName> readAllNames() {
        return liveNameRepository.findAll();
    }

    @Override
    public Optional<LiveName> readLiveName(String userId) {
        Optional<LiveName> name = liveNameRepository.findById(userId);
        return name;
    }

    @Override
    public Optional<LiveName> updateAccountUser(String userId, NameData nameData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
