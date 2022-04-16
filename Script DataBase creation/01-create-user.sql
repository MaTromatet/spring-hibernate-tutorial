----------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------CREATION DE L'UTILISATEUR hbstudent ET BASE DE DONNEES hb_student_tracker-----------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------


-- Connexion psql avec l utlisateur postgre
psql -p 5432 -h localhost -U postgres

-- Créez un compte utilisateur nommé hbstudent
DROP ROLE IF EXISTS hbstudent;
CREATE USER hbstudent;

-- Affectez les privilèges à l’utilisateur hbstudent.
ALTER ROLE hbstudent WITH PASSWORD 'hbstudent' LOGIN NOSUPERUSER INHERIT CREATEROLE CREATEDB NOREPLICATION;

-- Connexion avec utilisateur hbstudent sur serveur postgres
\c postgres hbstudent

-- Creation de la base de données nommée hb_student_tracker ayant comme propriétaire le compte utilisateur nommé hbstudent
DROP DATABASE IF EXISTS hb_student_tracker;
CREATE DATABASE hb_student_tracker OWNER hbstudent;

-- Connexion avec utilisateur hbstudent sur BDD hb_student_tracker
\c hb_student_tracker hbstudent





