CREATE TABLE IF NOT EXISTS reservations (
`id` int(1) NOT NULL AUTO_INCREMENT,
`user_id` int(1) NOT NULL,
`party_size` tinyint(1) NOT NULL,
`date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`restaurant_id` int(1) NOT NULL, 
PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8;

CREATE TABLE IF NOT EXISTS flights (
    id              INT PRIMARY KEY NOT NULL,
    source          TEXT NOT NULL,
    destination     TEXT NOT NULL,
    departure       TIMESTAMP NOT NULL DEFAULT NOW(),
    arrival         TIMESTAMP NOT NULL DEFAULT NOW(),
    tickets_count   INT NOT NULL,
    price           INT NOT NULL,
    carrier         TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS orders (
    id              INT PRIMARY KEY NOT NULL,
    source          TEXT NOT NULL,
    destination     TEXT NOT NULL,
    departure       TIMESTAMP NOT NULL DEFAULT NOW(),
    arrival         TIMESTAMP NOT NULL DEFAULT NOW(),
    tickets_count   INT NOT NULL,
    price           INT NOT NULL,
    carrier         TEXT NOT NULL,
    created_time    TIMESTAMP NOT NULL DEFAULT NOW()
);


-- CREATE TABLE IF NOT EXISTS vets (
--   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   first_name VARCHAR(30),
--   last_name VARCHAR(30),
--   INDEX(last_name)
-- ) engine=InnoDB;

-- CREATE TABLE IF NOT EXISTS specialties (
--   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   name VARCHAR(80),
--   INDEX(name)
-- ) engine=InnoDB;

-- CREATE TABLE IF NOT EXISTS vet_specialties (
--   vet_id INT(4) UNSIGNED NOT NULL,
--   specialty_id INT(4) UNSIGNED NOT NULL,
--   FOREIGN KEY (vet_id) REFERENCES vets(id),
--   FOREIGN KEY (specialty_id) REFERENCES specialties(id),
--   UNIQUE (vet_id,specialty_id)
-- ) engine=InnoDB;

-- CREATE TABLE IF NOT EXISTS types (
--   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   name VARCHAR(80),
--   INDEX(name)
-- ) engine=InnoDB;

-- CREATE TABLE IF NOT EXISTS owners (
--   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   first_name VARCHAR(30),
--   last_name VARCHAR(30),
--   address VARCHAR(255),
--   city VARCHAR(80),
--   telephone VARCHAR(20),
--   INDEX(last_name)
-- ) engine=InnoDB;

-- CREATE TABLE IF NOT EXISTS pets (
--   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   name VARCHAR(30),
--   birth_date DATE,
--   type_id INT(4) UNSIGNED NOT NULL,
--   owner_id INT(4) UNSIGNED,
--   INDEX(name),
--   FOREIGN KEY (owner_id) REFERENCES owners(id),
--   FOREIGN KEY (type_id) REFERENCES types(id)
-- ) engine=InnoDB;

-- CREATE TABLE IF NOT EXISTS visits (
--   id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
--   pet_id INT(4) UNSIGNED,
--   visit_date DATE,
--   description VARCHAR(255),
--   FOREIGN KEY (pet_id) REFERENCES pets(id)
-- ) engine=InnoDB;
