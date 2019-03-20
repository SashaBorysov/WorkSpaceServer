package com.workspace.controller;

import com.workspace.model.Recipe;
import com.workspace.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class RecipesController {

    private RecipeService recipeService;

    @Autowired
    public RecipesController(RecipeService userService) {
        this.recipeService = userService;
    }

    @GetMapping("recipes")
    @PreAuthorize("hasRole('USER')")
    public List<Recipe> getCurrentUser() {
        return recipeService.getAllRecipes();
    }

}
