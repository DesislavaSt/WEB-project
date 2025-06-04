--liquibase formatted sql

--changeset desistoeva:1
CREATE TABLE USERS
(
    id            numeric not null primary key,
    username      varchar(20),
    email         varchar(50),
    password_hash varchar(200),
    created_at timestamp
);

--changeset desistoeva:2
ALTER TABLE NOTES
ADD CONSTRAINT FK_NOTES FOREIGN KEY (userid) references USERS(id);

--changeset desistoeva:3
CREATE TABLE TODOS
(
    id            numeric not null primary key,
    user_id       numeric not null references USERS(id)
);

--changeset desistoeva:4
CREATE TABLE ITEMS
(
    id            numeric not null primary key,
    todo_id       numeric not null references TODOS(id),
    text          varchar(200),
    completed     numeric(1,0) DEFAULT 0
);

--changeset desistoeva:5
ALTER TABLE NOTES
DROP COLUMN todolistid;