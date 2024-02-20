package com.csi.userservice.repositories;

import com.csi.userservice.entities.LiveName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiveNameRepository extends JpaRepository<LiveName,String>{
    
    //if you want to implement any custom method or query
    //write
}
