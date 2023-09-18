-- Add constraints to every column of the INGREDIENTS table, you should use NOT NULL for some columns and unique for other(s)
alter table INGREDIENT 
add constraint unique (name);

alter table INGREDIENT 
modify CONTAINS_LACTOSE boolean not null;

alter table INGREDIENT 
modify VEGETARIAN boolean not null;

alter table INGREDIENT
modify VEGAN boolean not null;

alter table INGREDIENT 
modify GLUTEN_FREE boolean not null;
