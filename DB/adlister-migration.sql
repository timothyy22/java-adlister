USE adlister_db;

CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL
);

-- Create the 'ads' table
CREATE TABLE ads (
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     user_id INT,
                     title VARCHAR(255) NOT NULL,
                     description TEXT,
                     FOREIGN KEY (user_id) REFERENCES users(id)
);
