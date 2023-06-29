package com.sparta.test.Service;


import com.sparta.test.Dto.UserResponseDto;
import com.sparta.test.Entity.User;
import com.sparta.test.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }



    public UserResponseDto getUser(Long id) {
        User user = findUser(id);
        UserResponseDto userResponseDto = new UserResponseDto(user);
        return userResponseDto;
    }

    public List<UserResponseDto> getUsers(){
        return userRepository.findAllByOrderByIdDesc().stream().map(UserResponseDto::new).toList();
    }

    private User findUser(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("선택한 메모가 존재하지 않습니다")
        );
    }

}
