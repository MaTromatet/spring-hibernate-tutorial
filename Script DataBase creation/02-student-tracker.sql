------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------- CREATION DES TABLES -----------------------------------------------------------------------
----------------------------------------------- hb_student_tracker -----------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------

-- Destruction des tables si elles existent

DROP TABLE IF EXISTS student;

-- Création des tables

CREATE TABLE student (
  id  SERIAL PRIMARY KEY,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  date_of_birth date DEFAULT NULL,
  email varchar(45) DEFAULT NULL
);





