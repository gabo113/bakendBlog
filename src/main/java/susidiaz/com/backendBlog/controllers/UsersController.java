package susidiaz.com.backendBlog.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import susidiaz.com.backendBlog.models.requests.UserDetailsRequestModel;
import susidiaz.com.backendBlog.models.response.UserRest;
import susidiaz.com.backendBlog.services.UserServiceInterface;
import susidiaz.com.backendBlog.share.dtos.UserDto;

@RestController
@RequestMapping("/users") //localhost:8080/users
public class UsersController {
    @Autowired
    UserServiceInterface userService;
    @GetMapping
    public String getUser(){
        return "Get user details";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest userToReturn = new UserRest();

        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);

        BeanUtils.copyProperties(createdUser, userToReturn);

        return userToReturn;

    }
}

