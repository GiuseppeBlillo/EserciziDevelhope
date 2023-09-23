package eserciziSpringBoot.services;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import eserciziSpringBoot.entities.Meal;
import eserciziSpringBoot.dao.MealDao;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealService {
    @Autowired
    private MealDao mealDao;

    public void addMeal(Meal m){
        if(m == null) throw new IllegalArgumentException("Meal cannot be null!");
        if(m.getName() == null || m.getName().isEmpty()) throw new IllegalArgumentException("Meal name cannot be null or empty!");
        if(m.getDescription() == null || m.getDescription().isEmpty()) throw new IllegalArgumentException("Meal description cannot be null or empty!");
        if(m.getPrice() <= 0) throw new IllegalArgumentException("Meal price cannot be less than or equal 0!");
        if(m.getPrice() >= 100) throw new IllegalArgumentException("Meal price cannot be greater than 100!");
        mealDao.save(m);
    }


    public void deleteMeal (Long id){
        mealDao.deleteById(id);
    }

    public Optional<Meal> updateMeal(Long id, Meal meal){
        Optional<Meal> mealTemp = mealDao.findById(id);
        if (mealTemp.isPresent()){
            mealTemp.get().setName(meal.getName());
            mealTemp.get().setPrice(meal.getPrice());
            mealTemp.get().setDescription(meal.getDescription());
            mealTemp.get().setWinter(meal.isWinter());
            return Optional.of(mealDao.save(mealTemp.get()));
        } else {
            return Optional.empty();
        }
    }

    public List<Meal> getMealList(){
        return mealDao.findAll();
    }

    public List<Meal> getWinterMealList() throws UnirestException {
        if (getTemperature() < 12) {
            return mealDao.findByWinter(true);
        } else return null;
    }

    private double getTemperature() throws UnirestException {
        JSONObject response =
                Unirest.get("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true").asJson().getBody().getObject();
        return response.getJSONObject("current_weather").getDouble("temperature");
    }

}
