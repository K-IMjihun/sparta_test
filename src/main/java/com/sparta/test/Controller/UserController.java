package com.sparta.test.Controller;

import com.sparta.test.Dto.UserResponseDto;
import com.sparta.test.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class UserController {
    private final UserService userService;
    @GetMapping
    public List<UserResponseDto> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("{id}")
    public UserResponseDto getUser(@PathVariable Long id){
        return userService.getUser(id);

    }




    }
