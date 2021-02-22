package com.homeAutomation.backEnd.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

    public void addNewUser(Users users) {
        Optional<Users> userByEmail = usersRepository.findUserByEmail(users.getEmail());

        if (userByEmail.isPresent()){
            throw new IllegalStateException("Already Exists");
        }

        usersRepository.save(users);
    }
}
