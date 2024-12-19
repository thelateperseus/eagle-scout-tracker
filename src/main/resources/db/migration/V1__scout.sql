CREATE TABLE scout (
    id bigserial not null primary key,
    name varchar(100) not null,
    email varchar(100) not null,
    birth_date date not null
);
