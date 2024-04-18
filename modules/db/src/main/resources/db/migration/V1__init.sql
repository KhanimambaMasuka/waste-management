CREATE TABLE roles (
                            id SERIAL PRIMARY KEY,
                            description TEXT NOT NULL,
);

CREATE TABLE users (
                       user_id SERIAL PRIMARY KEY,
                       username TEXT UNIQUE NOT NULL,
                       password TEXT NOT NULL,
                       email TEXT UNIQUE NOT NULL,
                       role_id INTEGER REFERENCES roles(id)
);

CREATE TABLE waste_item (
                             id SERIAL PRIMARY KEY,
                             user_id INTEGER REFERENCES users(user_id),
                             waste_type TEXT NOT NULL,
                             weight DECIMAL(10, 2) NOT NULL,
                             date_created DATE NOT NULL DEFAULT CURRENT_DATE,
                             status TEXT NOT NULL
);

CREATE TABLE recycling_bins (
                                bin_id SERIAL PRIMARY KEY,
                                location_name VARCHAR(100) NOT NULL,
                                latitude DECIMAL(9, 6) NOT NULL,
                                longitude DECIMAL(9, 6) NOT NULL,
                                type VARCHAR(50) NOT NULL
);

-- Create Pickup Schedule Table
CREATE TABLE pickup_schedule (
                                 schedule_id SERIAL PRIMARY KEY,
                                 user_id INT REFERENCES users(user_id),
                                 waste_id INT REFERENCES waste_items(waste_id),
                                 pickup_date DATE NOT NULL,
                                 status VARCHAR(50) NOT NULL
);

-- Create Analytics Data Table
CREATE TABLE analytics_data (
                                analytics_id SERIAL PRIMARY KEY,
                                user_id INT REFERENCES users(user_id),
                                waste_type VARCHAR(50) NOT NULL,
                                total_weight DECIMAL(10, 2) NOT NULL,
                                recycled_weight DECIMAL(10, 2) NOT NULL,
                                date_analyzed DATE NOT NULL DEFAULT CURRENT_DATE
);

-- Create User-Role Mapping Table
CREATE TABLE user_role_mapping (
                                   user_role_id SERIAL PRIMARY KEY,
                                   user_id INT REFERENCES users(user_id),
                                   role_id INT REFERENCES user_roles(role_id)
);
