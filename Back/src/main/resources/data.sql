CREATE TABLE `dbuser` (
  `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
  `email` VARCHAR(255),
  `name` VARCHAR(255),
  `role` VARCHAR(255),
  `password` VARCHAR(255),
  `created_at` TIMESTAMP,
  `updated_at` TIMESTAMP
);

CREATE TABLE `RENTALS` (
  `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
  `name` VARCHAR(255),
  `surface` NUMERIC,
  `price` NUMERIC,
  `picture` VARCHAR(255),
  `description` VARCHAR(2000),
  `owner_id` INTEGER NOT NULL,
  `created_at` TIMESTAMP,
  `updated_at` TIMESTAMP,
  FOREIGN KEY (`owner_id`) REFERENCES `dbuser` (`id`)
);

CREATE TABLE `MESSAGES` (
  `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
  `rental_id` INTEGER,
  `user_id` INTEGER,
  `message` VARCHAR(2000),
  `created_at` TIMESTAMP,
  `updated_at` TIMESTAMP,
  FOREIGN KEY (`rental_id`) REFERENCES `RENTALS` (`id`),
  FOREIGN KEY (`user_id`) REFERENCES `dbuser` (`id`)
);

CREATE UNIQUE INDEX `dbuser_index` ON `dbuser` (`email`);


INSERT INTO dbuser (email, password, role) VALUES ('dbuser', '$2y$10$.qkbukzzX21D.bqbI.B2R.tvWP90o/Y16QRWVLodw51BHft7ZWbc.', 'USER'),
('dbadmin', '$2y$10$kp1V7UYDEWn17WSK16UcmOnFd1mPFVF6UkLrOOCGtf24HOYt8p1iC', 'ADMIN');