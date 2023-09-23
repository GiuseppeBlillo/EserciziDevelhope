package eserciziSpringBoot.controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import eserciziSpringBoot.entities.Meal;
import eserciziSpringBoot.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MealController {
    @Autowired
    private MealService mealService;

    @GetMapping("/get/meals")
    public ResponseEntity<List<Meal>> index(){
        return ResponseEntity.ok(mealService.getMealList());
    }
    @GetMapping("/put/meal")
    public ResponseEntity<String> putItem(@RequestBody Meal m){
        try{
            mealService.addMeal(m);
            return ResponseEntity.ok("Meal added!");
        } catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/delete/meal/{id}")
    public ResponseEntity<String> deleteMeal(@PathVariable Long id){
        mealService.deleteMeal(id);
        return ResponseEntity.ok("Meal deleted!");
    }

    @GetMapping("/get/winter_meals_sales")
    public ResponseEntity<?> index_sales() throws UnirestException {
        if (mealService.getWinterMealList() != null){
            return ResponseEntity.ok(mealService.getWinterMealList());
        } else {
            return ResponseEntity.badRequest().body("it's already hot for winter sales!");
        }
    }
}
