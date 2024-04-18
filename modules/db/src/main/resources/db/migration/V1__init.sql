DROP SCHEMA IF EXISTS app CASCADE;

CREATE SCHEMA IF NOT EXISTS app;

SET SCHEMA 'app';

CREATE TABLE roles
(
    id          SERIAL PRIMARY KEY,
    description TEXT NOT NULL
);

CREATE TABLE users
(
    user_id  SERIAL PRIMARY KEY,
    username TEXT UNIQUE NOT NULL,
    password TEXT        NOT NULL,
    email    TEXT UNIQUE NOT NULL,
    role_id  INTEGER REFERENCES roles (id)
);

CREATE TABLE waste_item
(
    id           SERIAL PRIMARY KEY,
    user_id      INTEGER REFERENCES users (user_id),
    waste_type   TEXT           NOT NULL,
    weight       DECIMAL(10, 2) NOT NULL,
    date_created DATE           NOT NULL DEFAULT CURRENT_DATE,
    status       TEXT           NOT NULL
);

CREATE TABLE recycling_bin
(
    id            SERIAL PRIMARY KEY,
    location_name text          NOT NULL,
    latitude      DECIMAL(9, 6) NOT NULL,
    longitude     DECIMAL(9, 6) NOT NULL,
    type          TEXT          NOT NULL
);

CREATE TABLE pickup_schedule
(
    id             SERIAL PRIMARY KEY,
    user_id        INTEGER REFERENCES users (user_id),
    recycle_bin_id INTEGER REFERENCES recycling_bin (id),
    pickup_date    DATE        NOT NULL,
    status         VARCHAR(50) NOT NULL
);

CREATE TABLE analytics_data
(
    id              SERIAL PRIMARY KEY,
    user_id         INTEGER REFERENCES users (user_id),
    waste_type      TEXT           NOT NULL,
    total_weight    DECIMAL(10, 2) NOT NULL,
    recycled_weight DECIMAL(10, 2) NOT NULL,
    date_analyzed   DATE           NOT NULL DEFAULT CURRENT_DATE
);

CREATE TABLE user_roles
(
    id      SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users (user_id),
    role_id INTEGER REFERENCES roles (id)
);
