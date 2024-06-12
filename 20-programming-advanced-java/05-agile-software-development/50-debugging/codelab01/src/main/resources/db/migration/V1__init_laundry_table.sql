create sequence pizza_seq start with 1 increment by 1;

create table pizza
(
    id            integer,
    pizza_type  varchar(255),
    customer         varchar(255),
    description   varchar(255),
    creation_date timestamp,
    primary key (id)
);
