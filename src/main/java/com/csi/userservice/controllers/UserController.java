package com.csi.userservice.controllers;

import com.csi.userservice.entities.AccountUser;
import com.csi.userservice.modal.UserData;
import com.csi.userservice.services.AccountUserService;
import com.csi.userservice.services.LiveNameService;
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
//import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
//import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private AccountUserService userService;
    
    @Autowired
    private LiveNameService nameService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //create User
    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody UserData userData, HttpServletRequest servletRequest, 
            HttpServletResponse servletResponse) {
        AccountUser createdUser = userService.createAccountUser(servletRequest,userData);
        nameService.createLiveName(servletRequest, userData.getNameData(), createdUser.getUserId());
        return ResponseEntity.status(HttpStatus.CREATED).body("User Created...!!!"+createdUser.getUserId());
    }

    //single user get
    @GetMapping("/{userId}")
//    @RateLimiter(name = "userRateLimiter", fallbackMethod = "ratingHotelFallback")
    public ResponseEntity<Optional<AccountUser>> getSingleUser(@PathVariable String userId) {
        logger.info("Get Single User Handler: UserController");
        Optional<AccountUser> user = userService.readAccountUser(userId);
        return ResponseEntity.ok(user);
    }

    //creating fall back  method for circuitbreaker
//    public ResponseEntity<AccountUser> ratingHotelFallback(String userId, Exception ex) {
//        logger.info("Fallback is executed because service is down : ", ex.getMessage());
//        ex.printStackTrace();
//        User user = new AccountUserBuilder()
//                .setEmail("dummy@gmail.com")
//                .setAccountUserId("dummyId")
//                .setName("Dummy")
//                .setAbout("This user is created dummy because some service is down")
//                .setId("141234")
//                .build();
//        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
//    }


    @GetMapping("/getAllUser")
    public ResponseEntity<List<AccountUser>> getAllUser() {
        List<AccountUser> allUser = userService.readAllAccountUser();
        return ResponseEntity.ok(allUser);
    }
}
