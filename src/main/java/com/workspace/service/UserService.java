package com.workspace.service;

import com.workspace.entity.Users;
import com.workspace.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public void createUsers(Users users) {
        usersRepository.save(users);
    }

    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    public Users findById(Long userId){
        return usersRepository.findById(userId).orElse(null);
    }

    public List<Users> findAllByName(String name){
        return usersRepository.findAllByName(name);
    }

    public List<Users> findWhereEmailIsGmail(){
        return usersRepository.findWhereEmailIsGmail();
    }

    public List<Users> findWhereNameStartsFromSmith(){
        return usersRepository.findWhereNameStartsFromSmith();
    }

    public void clearUsersDb(){ usersRepository.removeAllUsers();}

    public void addUser(Users user) {
        usersRepository.save(user);
    }

}