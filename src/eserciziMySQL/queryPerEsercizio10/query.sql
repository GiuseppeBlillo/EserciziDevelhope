-- Using the INGREDIENT and MEAL tables, write a query to return the name of all meals that contain garlic.

SELECT DISTINCT M.NAME AS MEALS 
FROM MEAL M
JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
WHERE I.NAME = 'Garlic';

-- Using the INGREDIENT and MEAL tables, write a query to return the number of meals with vegetarian ingredients.

SELECT COUNT(DISTINCT M.MEAL_ID) AS NUMBER_OF_VEGETARIAN_MEALS 
FROM MEAL M
JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
WHERE I.VEGETARIAN = TRUE;

-- Using the INGREDIENT and MEAL tables, write a query to return the names of meals that have at least 1 gluten free ingredient and at least 1 vegan ingredient.

SELECT DISTINCT M.NAME
FROM MEAL M
JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
WHERE VEGAN = TRUE AND GLUTEN_FREE = TRUE;

-- Using the INGREDIENT and MEAL tables, write a query to return the average number of ingredients per meal.

SELECT M.NAME AS "Portate" , COUNT(I.MEAL_ID) AS "Conteggio degli ingredienti" 
FROM MEAL M
JOIN INGREDIENT I ON I.MEAL_ID = M.MEAL_ID
GROUP BY M.NAME;


-- Using the INGREDIENT and MEAL tables, write a query to return the names of meals that have more than 3 ingredients.

SELECT DISTINCT M.NAME AS "Portate con più di 3 ingredienti"
FROM MEAL M
JOIN INGREDIENT I ON M.MEAL_ID = I.MEAL_ID
GROUP BY M.NAME
HAVING COUNT(I.NAME)>3;

-- Using the following table definitions, write an inner join for the two tables

SELECT * FROM CUSTOMER C 
INNER JOIN O ON C.CUSTOMER_ID = O.CUSTOMER_ID;

-- Using the following table definitions, write an inner join for the two tables

SELECT * FROM INVENTORY I 
INNER JOIN P ON I.PRODUCT_ID = P.PRODUCT_ID;
