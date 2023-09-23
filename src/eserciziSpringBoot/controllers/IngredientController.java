package eserciziSpringBoot.controllers;

import eserciziSpringBoot.entities.Ingredient;
import eserciziSpringBoot.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/get/Ingredients")
    public ResponseEntity<List<Ingredient>> index(){
        return ResponseEntity.ok(ingredientService.getIngredientList());
    }
    @GetMapping("/put/Ingredient")
    public ResponseEntity<String> putItem(@RequestBody Ingredient i){
        ingredientService.addIngredient(i);
        return ResponseEntity.ok("Ingredient added!");
    }

    @DeleteMapping("/delete/Ingredient/{id}")
    public ResponseEntity<String> deleteIngredient(@PathVariable Long id){
        ingredientService.deleteIngredient(id);
        return ResponseEntity.ok("Ingredient deleted!");
    }
}
