package com.minttcode.hackathon.iqr.endpoint;

import com.minttcode.hackathon.iqr.model.User;
import com.minttcode.hackathon.iqr.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping("/hello")
    public String sayHello (){
        logger.info("Service Called");
        return "Hello Sr ";
    }



    @PostMapping
    public  @ResponseBody User saveUsers (@RequestBody User user){

       return  userService.createUser(user);

    }

    @GetMapping("/{telefono}")
    public @ResponseBody
    User getUser(@PathVariable String telefono) {
        return userService.getUserByTelefono(telefono);

    }

}
