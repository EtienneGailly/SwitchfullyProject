create table ADDRESS (
    id varchar(255) not null unique primary key,
    street_name varchar(255),
    number varchar(255),
    zip_code varchar(255),
    city varchar(255)
);
