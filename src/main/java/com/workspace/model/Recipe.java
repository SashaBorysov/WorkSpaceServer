package com.workspace.model;

import javax.persistence.*;

@Entity
@Table(name = "recipe" )
public class Recipe {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long recipe_id;

        private String recipe_title;

        private String recipe_content;

        private String recipe_rating;

        private Long date_added;

        public Recipe() {
        }

        public Recipe(Long recipe_id, String recipe_title, String recipe_content, String recipe_rating, Long date_added) {
                this.recipe_id = recipe_id;
                this.recipe_title = recipe_title;
                this.recipe_content = recipe_content;
                this.recipe_rating = recipe_rating;
                this.date_added = date_added;
        }

        public Long getRecipe_id() {
                return recipe_id;
        }

        public void setRecipe_id(Long recipe_id) {
                this.recipe_id = recipe_id;
        }

        public String getRecipe_title() {
                return recipe_title;
        }

        public void setRecipe_title(String recipe_title) {
                this.recipe_title = recipe_title;
        }

        public String getRecipe_content() {
                return recipe_content;
        }

        public void setRecipe_content(String recipe_content) {
                this.recipe_content = recipe_content;
        }

        public String getRecipe_rating() {
                return recipe_rating;
        }

        public void setRecipe_rating(String recipe_rating) {
                this.recipe_rating = recipe_rating;
        }

        public Long getDate_added() {
                return date_added;
        }

        public void setDate_added(Long date_added) {
                this.date_added = date_added;
        }
}
