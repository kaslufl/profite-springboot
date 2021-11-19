create table product (
    id int auto_increment primary key,
    name varchar(240),
    image varchar(240),
    oldPrice decimal(5,2),
    price decimal(5,2),
    description varchar(240),
    installments int
);