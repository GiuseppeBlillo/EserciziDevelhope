CREATE TABLE MEAL (
  MEAL_ID INT,
  NAME VARCHAR(255),
  PRICE DOUBLE,
  CALORIES INT
);

CREATE TABLE INGREDIENT (
  MEAL_ID INT,
  NAME VARCHAR(255),
  CONTAINS_LACTOSE BOOLEAN,
  VEGETARIAN BOOLEAN,
  VEGAN BOOLEAN,
  GLUTEN_FREE BOOLEAN
);

INSERT INTO MEAL(MEAL_ID, NAME, PRICE, CALORIES)
VALUES (1, 'Spaghetti Bolognese', 12.99, 600),
       (2, 'Grilled Chicken Sandwich', 8.99, 400),
       (3, 'Pesto Pasta', 10.99, 550),
       (4, 'Steak and Mash', 19.99, 800),
       (5, 'Sushi Platter', 15.99, 700);

INSERT INTO INGREDIENT (MEAL_ID, NAME, CONTAINS_LACTOSE, VEGETARIAN, VEGAN, GLUTEN_FREE)
VALUES (2, 'Grilled Chicken', FALSE, FALSE, FALSE, TRUE),
	   (1, 'Bread', FALSE, TRUE, FALSE, FALSE),
       (1, 'Lettuce', FALSE, TRUE, TRUE, TRUE),
       (1, 'Tomato', FALSE, TRUE, TRUE, TRUE),
       (1, 'Mayo', TRUE, TRUE, FALSE, TRUE),
       (2, 'Lentils', FALSE, TRUE, TRUE, TRUE),
       (2, 'Onion', FALSE, TRUE, TRUE, TRUE),
       (2, 'Garlic', FALSE, TRUE, TRUE, TRUE),
       (2, 'Ginger', FALSE, TRUE, TRUE, TRUE),
       (2, 'Cumin', FALSE, TRUE, TRUE, TRUE),
       (2, 'Turmeric', FALSE, TRUE, TRUE, TRUE),
       (3, 'Pasta', FALSE, TRUE, FALSE, FALSE),
       (3, 'Pesto', TRUE, TRUE, FALSE, TRUE),
       (3, 'Pine Nuts', FALSE, TRUE, TRUE, TRUE),
       (3, 'Basil', FALSE, TRUE, TRUE, TRUE),
       (3, 'Garlic', FALSE, TRUE, TRUE, TRUE),
       (3, 'Parmesan Cheese', TRUE, FALSE, FALSE, FALSE),
       (1, 'Spaghetti', FALSE, TRUE, FALSE, FALSE),
       (4, 'Ground Beef', FALSE, FALSE, FALSE, TRUE),
       (4, 'Onion', FALSE, TRUE, TRUE, TRUE),
       (4, 'Garlic', FALSE, TRUE, TRUE, TRUE),
       (1, 'Tomato Sauce', FALSE, TRUE, TRUE, TRUE),
       (4, 'Steak', FALSE, FALSE, FALSE, TRUE),
       (2, 'Mashed Potatoes', FALSE, TRUE, FALSE, TRUE),
       (4, 'Butter', TRUE, TRUE, FALSE, TRUE),
       (4, 'Salt', FALSE, TRUE, TRUE, TRUE),
       (4, 'Pepper', FALSE, TRUE, TRUE, TRUE),
       (5, 'Sushi Rice', FALSE, TRUE, TRUE, FALSE),
       (5, 'Nori', FALSE, TRUE, TRUE, TRUE),
       (5, 'Tuna', FALSE, FALSE, FALSE, TRUE),
       (5, 'Salmon', FALSE, FALSE, FALSE, TRUE),
       (5, 'Avocado', FALSE, TRUE, TRUE, TRUE),
       (5, 'Wasabi', FALSE, TRUE, TRUE, TRUE),
       (5, 'Soy Sauce', FALSE, TRUE, TRUE, TRUE);