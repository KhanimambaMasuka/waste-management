DROP SCHEMA IF EXISTS app CASCADE;

CREATE SCHEMA IF NOT EXISTS app;

SET SCHEMA 'app';

CREATE TABLE roles
(
    id          TEXT NOT NULL PRIMARY KEY,
    description TEXT NOT NULL
);

CREATE TABLE users
(
    id        SERIAL PRIMARY KEY,
    full_name TEXT UNIQUE NOT NULL,
    password  TEXT        NOT NULL,
    email     TEXT UNIQUE NOT NULL,
    role_id   TEXT REFERENCES roles (id)
);

CREATE TABLE waste_type
(
    id          TEXT PRIMARY KEY NOT NULL,
    description TEXT             NOT NULL
);

INSERT INTO waste_type (id, description)
VALUES ('PAPER', 'Newspapers, Magazines, Office paper, Cardboard'),
       ('GLASS', 'Glass bottles, Glass jars'),
       ('PLASTIC',
        'Water bottles (PET), Soda bottles (PET), Milk jugs (HDPE), Shampoo bottles (HDPE and PET), Yogurt containers (PP), Plastic bags (LDPE)'),
       ('METALS', 'Aluminum cans, Tin cans, Steel cans, Aluminum foil'),
       ('TEXTILES', 'Clothing, Bedding, Towels, Curtains'),
       ('ELECTRONICS', 'Computers, Mobile phones, TVs, Printers'),
       ('ORGANIC_WASTE', 'Food scraps, Yard waste (grass clippings, leaves), Compostable materials'),
       ('BATTERIES', 'Rechargeable batteries, Single-use batteries'),
       ('TIRES', 'Car tires, Bicycle tires'),
       ('CONSTRUCTION_MATERIALS', 'Bricks, Concrete, Wood'),
       ('CERAMICS', 'Windows, Dishes, Tiles, Porcelain');

create table waste_status
(
    id          text primary key not null,
    description text             not null
);

insert into waste_status(id, description)
VALUES ('SCHEDULED', 'scheduled'),
       ('PICKED_UP', 'picked up'),
       ('CANCELLED', 'cancelled');

CREATE TABLE waste
(
    id           SERIAL PRIMARY KEY,
    type         TEXT           NOT NULL REFERENCES waste_type (id),
    weight       DECIMAL(10, 2) NOT NULL,
    date_created DATE           NOT NULL DEFAULT CURRENT_DATE,
    status       TEXT           NOT NULL
);

CREATE TABLE recycling_bin
(
    id            SERIAL PRIMARY KEY,
    location_name TEXT          NOT NULL,
    latitude      DECIMAL(9, 6) NOT NULL,
    longitude     DECIMAL(9, 6) NOT NULL,
    type          TEXT          NOT NULL REFERENCES waste_type (id)
);

CREATE TABLE pickup_schedule
(
    id          SERIAL PRIMARY KEY,
    user_id     INTEGER REFERENCES users (id),
    pickup_date DATE NOT NULL,
    status      TEXT NOT NULL REFERENCES waste_status (id)
);

CREATE TABLE analytics_data
(
    id              SERIAL PRIMARY KEY,
    user_id         INTEGER REFERENCES users (id),
    waste_type      TEXT           NOT NULL,
    total_weight    DECIMAL(10, 2) NOT NULL,
    recycled_weight DECIMAL(10, 2) NOT NULL,
    date_analyzed   DATE           NOT NULL DEFAULT CURRENT_DATE
);

CREATE TABLE user_roles
(
    id      SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users (id),
    role_id TEXT REFERENCES roles (id)
);
