package com.sparta.test.Service;


import com.sparta.test.Dto.UserResponseDto;
import com.sparta.test.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserResponseDto> getUsers(){
        return userRepository.findAllByOrderByIdDesc().stream().map(UserResponseDto::new).toList();
    }

}
