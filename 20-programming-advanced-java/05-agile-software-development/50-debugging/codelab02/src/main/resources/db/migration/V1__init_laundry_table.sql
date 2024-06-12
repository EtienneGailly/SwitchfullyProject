create sequence pizza_seq start with 1 increment by 1;

create table pizza
(
    id               integer,
    pizza_type       varchar(255),
    customer         varchar(255),
    description      varchar(255),
    creation_date    timestamp,
    with_mushrooms   BOOLEAN,
    with_mozzarella  BOOLEAN,
    with_pepperoni   BOOLEAN,
    with_ham         BOOLEAN,
    with_hot_peppers BOOLEAN,
    with_olives      BOOLEAN,
    primary key (id)
);
