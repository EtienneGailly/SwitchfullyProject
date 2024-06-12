insert into PIZZA (id, pizza_type, customer, description, creation_date, with_mushrooms, with_mozzarella, with_pepperoni, with_ham, with_hot_peppers, with_olives)
values (nextval('pizza_seq'), 'HAWAII', 'Herman', 'please no mushrooms', parsedatetime('2020-03-21 12:23:30', 'yyyy-MM-dd HH:mm:ss'), false, false, false, false, false, false);


