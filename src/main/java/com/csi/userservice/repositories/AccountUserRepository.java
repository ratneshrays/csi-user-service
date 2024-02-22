package com.csi.userservice.repositories;

import com.csi.userservice.entities.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountUserRepository extends JpaRepository<AccountUser,String>{
    
    //if you want to implement any custom method or query
    //write
    AccountUser findByUsername(String username);
}
