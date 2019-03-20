package com.workspace.service;

import com.workspace.model.Recipe;
import com.workspace.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }

}
