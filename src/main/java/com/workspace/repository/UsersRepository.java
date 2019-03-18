package com.workspace.repository;

import com.workspace.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findAllByName(String name);

    @Query("select u from Users u where u.email like '%@gmail.com%'")
    List<Users> findWhereEmailIsGmail();

    @Query(value = "select * from users where name like '%smith%'", nativeQuery = true)
    List<Users> findWhereNameStartsFromSmith();

    @Query(value = "TRUNCATE TABLE users", nativeQuery = true)
    void removeAllUsers();

}
