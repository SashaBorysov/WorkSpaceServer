package com.workspace.repository;

import com.workspace.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
//    Optional<Recipe> findByName(RoleName roleName);
}

