package eserciziSpringBoot.dao;

import eserciziSpringBoot.entities.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealDao extends JpaRepository<Meal, Long> {

    List<Meal> findByWinter(boolean winter);
}
