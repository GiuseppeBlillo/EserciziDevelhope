package eserciziSpringBoot.services;

import eserciziSpringBoot.entities.Ingredient;
import eserciziSpringBoot.dao.IngredientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {
    @Autowired
    private IngredientDao ingredientDao;

    public void addIngredient(Ingredient i){
        if(i == null) throw new IllegalArgumentException("Ingredient cannot be null!");
        if(i.getName() == null || i.getName().isEmpty()) throw new IllegalArgumentException("Ingredient name cannot be null or empty!");
        ingredientDao.save(i);
    }

    public void deleteIngredient (Long id){
        ingredientDao.deleteById(id);
    }

    public Optional<Object> updateIngredient(Long id, Ingredient i){
        Optional<Ingredient> igTemp = ingredientDao.findById(id);
        if (igTemp.isPresent()){
            igTemp.get().setName(i.getName());
            igTemp.get().setGlutenFree(i.isGlutenFree());
            igTemp.get().setVegetarian(i.isVegetarian());
            igTemp.get().setVegan(i.isVegan());
            igTemp.get().setLactoseFree(i.isLactoseFree());
            return Optional.of(ingredientDao.save(igTemp.get()));
        } else {
            return Optional.empty();
        }
    }

    public List<Ingredient> getIngredientList(){
        return ingredientDao.findAll();
    }}
