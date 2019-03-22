package com.workspace.repository;

import com.workspace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    Optional<Product> findByName(RoleName roleName);

//    @Query(value = "select * from products where product_code like '%smith%'", nativeQuery = true)
//    Optional<Product> findByProductCode(String code);

//    @Query( "select o from products o where product_code = :code" )
//    Product findByProductCode(@Param("code") String productCode);

    @Query(
            value = "SELECT * FROM products WHERE product_code = :code",
            nativeQuery = true)
    Product findByProductCode(@Param("code") String productCode);

//    List<Users> findWhereNameStartsFromSmith();
//    List<Users> findAllByName(String name);
//
//    @Query("select u from Users u where u.email like '%@gmail.com%'")
//    List<Users> findWhereEmailIsGmail();
//
//    @Query(value = "select * from users where name like '%smith%'", nativeQuery = true)
//    List<Users> findWhereNameStartsFromSmith();
//
//    @Query(value = "TRUNCATE TABLE users", nativeQuery = true)
//    void removeAllUsers();
}

