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
    id       SERIAL PRIMARY KEY,
    full_name TEXT UNIQUE NOT NULL,
    password TEXT        NOT NULL,
    email    TEXT UNIQUE NOT NULL,
    role_id  TEXT REFERENCES roles (id)
);

CREATE TABLE waste_type
(
    id          TEXT PRIMARY KEY NOT NULL,
    description TEXT NOT NULL
);

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
    id             SERIAL PRIMARY KEY,
    user_id        INTEGER REFERENCES users (id),
    pickup_date    DATE NOT NULL,
    status         TEXT NOT NULL
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
